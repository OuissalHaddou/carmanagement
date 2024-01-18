package com.client.repository;

import com.client.model.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long>
{
	 public Proprietaire findBynom(String nom);
}
