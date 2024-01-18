package com.voiture.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voiture.model.Proprietaire;
import com.voiture.repository.ProprietaireRepository;
import com.voiture.services.ProprietaireService;



@Service
public class ProprietaireServiceImpl implements ProprietaireService{
	@Autowired
	public ProprietaireRepository proprietaireRepository;
	
	@Override
	public Proprietaire saveProprietaire(Proprietaire proprietaire) {
		// TODO Auto-generated method stub
		return this.proprietaireRepository.save(proprietaire);
	}

	@Override
	public Proprietaire updateProprietaire(Proprietaire proprietaire) {
		// TODO Auto-generated method stub
		return this.proprietaireRepository.save(proprietaire);
	}

	@Override
	public String deleteProprietaireById(Long id) {
		// TODO Auto-generated method stub
		this.proprietaireRepository.deleteById(id);
		return  "Proprietaire Supprimé avec succes !";
	}

	@Override
	public String deleteProprietaireByObject(Proprietaire proprietaire) {
		// TODO Auto-generated method stub
		this.proprietaireRepository.deleteById(proprietaire.getId());
		return "Proprietaire Supprimé avec succes !";
	}

	@Override
	public List<Proprietaire> getAllProprietaire() {
		// TODO Auto-generated method stub
		return this.proprietaireRepository.findAll();
	}

	@Override
	public Proprietaire findProprietaireById(Long id) {
		// TODO Auto-generated method stub
		return this.proprietaireRepository.findById(id).orElse(null);
	}

	@Override
	public Proprietaire findProprietaireByNom(String nom) {
		// TODO Auto-generated method stub
		return this.proprietaireRepository.findBynom(nom);
	}

}
