package com.voiture.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voiture.model.Voiture;
import com.voiture.repository.VoitureRepository;
import com.voiture.services.VoitureService;



@Service
public class VoitureServiceImpl implements VoitureService{
	@Autowired
	public VoitureRepository voitureRepository;
	
	@Override
	public Voiture saveVoiture(Voiture voiture) {
		// TODO Auto-generated method stub
		return this.voitureRepository.save(voiture);
	}

	@Override
	public Voiture updateVoiture(Voiture voiture) {
		// TODO Auto-generated method stub
		return this.voitureRepository.save(voiture);
	}

	@Override
	public String deleteVoitureById(Long id) {
		// TODO Auto-generated method stub
		this.voitureRepository.deleteById(id);
		return  "Voiture Supprimé avec succes !";
	}

	@Override
	public String deleteVoitureByObject(Voiture voiture) {
		// TODO Auto-generated method stub
		this.voitureRepository.deleteById(voiture.getId());
		return "Voiture Supprimé avec succes !";
	}

	@Override
	public List<Voiture> getAllVoiture() {
		// TODO Auto-generated method stub
		return this.voitureRepository.findAll();
	}

	@Override
	public Voiture findVoitureById(Long id) {
		// TODO Auto-generated method stub
		return this.voitureRepository.findById(id).orElse(null);
	}


}
