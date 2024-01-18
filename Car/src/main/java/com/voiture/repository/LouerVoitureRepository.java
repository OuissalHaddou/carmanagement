package com.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.model.LouerVoiture;


public interface LouerVoitureRepository extends JpaRepository<LouerVoiture, Long>{

}
