package com.client.services;

import java.util.List;

import com.client.model.Locataire;
import org.springframework.stereotype.Service;





@Service
public interface LocataireService {
	
	public Locataire saveLocataire(Locataire locataire);
	
	public Locataire updateLocataire(Locataire  locataire);
	
	public String deleteLocataireById(Long id);
	
	public String deleteLocataireByObject(Locataire locataire);

	public List<Locataire> getAllLocataire();

	public Locataire findLocataireById(Long id) ;
	
	public Locataire findLocataireByNom(String nom);

}
