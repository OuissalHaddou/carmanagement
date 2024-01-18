# Stage 1: Build the application using Maven
FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app
COPY ./src ./src
COPY ./pom.xml .

RUN mvn clean package

# Stage 2: Run the application in an Alpine-based OpenJDK image
FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY --from=builder /app/${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]