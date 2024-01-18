package com.voiture.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.model.Proprietaire;


@Service
public interface ProprietaireService {

	public Proprietaire saveProprietaire(Proprietaire proprietaire);
	
	public Proprietaire updateProprietaire(Proprietaire  proprietaire);
	
	public String deleteProprietaireById(Long id);
	
	public String deleteProprietaireByObject(Proprietaire proprietaire);

	public List<Proprietaire> getAllProprietaire();

	public Proprietaire findProprietaireById(Long id) ;
	
	public Proprietaire findProprietaireByNom(String nom);
}
