package com.client.servieImp;

import java.util.List;

import com.client.model.Locataire;
import com.client.repository.LocataireRepository;
import com.client.services.LocataireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class LocataireServiceImpl implements LocataireService {
	@Autowired
	public LocataireRepository locataireRepository;
	
	@Override
	public Locataire saveLocataire(Locataire locataire) {
		// TODO Auto-generated method stub
		return this.locataireRepository.save(locataire);
	}

	@Override
	public Locataire updateLocataire(Locataire locataire) {
		// TODO Auto-generated method stub
		return this.locataireRepository.save(locataire);
	}

	@Override
	public String deleteLocataireById(Long id) {
		// TODO Auto-generated method stub
		this.locataireRepository.deleteById(id);
		return  "Locataire Supprimé avec succes !";
	}

	@Override
	public String deleteLocataireByObject(Locataire locataire) {
		// TODO Auto-generated method stub
		this.locataireRepository.deleteById(locataire.getId());
		return "Locataire Supprimé avec succes !";
	}

	@Override
	public List<Locataire> getAllLocataire() {
		// TODO Auto-generated method stub
		return this.locataireRepository.findAll();
	}

	@Override
	public Locataire findLocataireById(Long id) {
		// TODO Auto-generated method stub
		return this.locataireRepository.findById(id).orElse(null);
	}

	@Override
	public Locataire findLocataireByNom(String nom) {
		// TODO Auto-generated method stub
		return this.locataireRepository.findBynom(nom);
	}

}
