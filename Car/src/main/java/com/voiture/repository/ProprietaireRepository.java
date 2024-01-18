package com.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.model.Proprietaire;


public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long>
{
	 public Proprietaire findBynom(String nom);
}
