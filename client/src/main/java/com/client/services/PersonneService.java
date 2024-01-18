package com.client.services;

import java.util.List;

import com.client.model.Personne;
import org.springframework.stereotype.Service;



@Service
public interface PersonneService {
	
	public Personne savePersonne(Personne personne);
	
	public Personne updatePersonne(Personne  personne);
	
	public String deletePersonneById(Long id);
	
	public String deletePersonneByObject(Personne personne);

	public List<Personne> getAllPersonne();

	public Personne findPersonneById(Long id) ;
	
	public Personne findPersonneByNom(String nom);
}
