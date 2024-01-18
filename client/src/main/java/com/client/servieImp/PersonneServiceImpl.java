package com.client.servieImp;

import java.util.List;

import com.client.model.Personne;
import com.client.repository.PersonneRepository;
import com.client.services.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class PersonneServiceImpl implements PersonneService {
	@Autowired
	public PersonneRepository personneRepository;
	
	@Override
	public Personne savePersonne(Personne personne) {
		// TODO Auto-generated method stub
		return this.personneRepository.save(personne);
	}

	@Override
	public Personne updatePersonne(Personne personne) {
		// TODO Auto-generated method stub
		return this.personneRepository.save(personne);
	}

	@Override
	public String deletePersonneById(Long id) {
		// TODO Auto-generated method stub
		this.personneRepository.deleteById(id);
		return  "Personne Supprimé avec succes !";
	}

	@Override
	public String deletePersonneByObject(Personne personne) {
		// TODO Auto-generated method stub
		this.personneRepository.deleteById(personne.getId());
		return "Personne Supprimé avec succes !";
	}

	@Override
	public List<Personne> getAllPersonne() {
		// TODO Auto-generated method stub
		return this.personneRepository.findAll();
	}

	@Override
	public Personne findPersonneById(Long id) {
		// TODO Auto-generated method stub
		return this.personneRepository.findById(id).orElse(null);
	}

	@Override
	public Personne findPersonneByNom(String nom) {
		// TODO Auto-generated method stub
		return this.personneRepository.findBynom(nom);
	}

}
