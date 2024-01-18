package com.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.model.Locataire;


public interface LocataireRepository extends JpaRepository<Locataire, Long>{
	 public Locataire findBynom(String nom);
}
