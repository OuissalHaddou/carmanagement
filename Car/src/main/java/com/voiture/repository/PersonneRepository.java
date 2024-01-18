package com.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.model.Personne;


public interface PersonneRepository extends JpaRepository<Personne, Long>{

	 public Personne findBynom(String nom);
}
