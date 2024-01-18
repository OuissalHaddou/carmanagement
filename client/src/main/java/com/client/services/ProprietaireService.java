package com.client.services;

import java.util.List;

import com.client.model.Proprietaire;
import org.springframework.stereotype.Service;



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
