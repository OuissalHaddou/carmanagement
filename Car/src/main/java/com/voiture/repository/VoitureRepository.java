package com.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.model.Voiture;


public interface VoitureRepository extends JpaRepository<Voiture, Long>{

}
