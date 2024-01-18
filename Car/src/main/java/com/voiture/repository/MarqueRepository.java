package com.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voiture.model.Marque;


public interface MarqueRepository extends JpaRepository<Marque,Long>{

}
