package com.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.model.Model;




public interface ModelRepository extends JpaRepository<Model, Long>{

}
