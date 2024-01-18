package com.client.repository;

import com.client.model.Locataire;
import org.springframework.data.jpa.repository.JpaRepository;



public interface LocataireRepository extends JpaRepository<Locataire, Long>{
	 public Locataire findBynom(String nom);
}
