package com.client.repository;

import com.client.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonneRepository extends JpaRepository<Personne, Long>{

	 public Personne findBynom(String nom);
}
