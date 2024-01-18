package com.voiture.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voiture.model.Marque;
import com.voiture.repository.MarqueRepository;
import com.voiture.services.MarqueService;




@Service
public class MarqueServiceImpl implements MarqueService{
	@Autowired
	public MarqueRepository marqueRepository;
	
	@Override
	public Marque saveMarque(Marque marque) {
		// TODO Auto-generated method stub
		return this.marqueRepository.save(marque);
	}

	@Override
	public Marque updateMarque(Marque marque) {
		// TODO Auto-generated method stub
		return this.marqueRepository.save(marque);
	}

	@Override
	public String deleteMarqueById(Long id) {
		// TODO Auto-generated method stub
		this.marqueRepository.deleteById(id);
		return  "Marque Supprimé avec succes !";
	}

	@Override
	public String deleteMarqueByObject(Marque marque) {
		// TODO Auto-generated method stub
		this.marqueRepository.deleteById(marque.getId());
		return "Marque Supprimé avec succes !";
	}

	@Override
	public List<Marque> getAllMarque() {
		// TODO Auto-generated method stub
		return this.marqueRepository.findAll();
	}

	@Override
	public Marque findMarqueById(Long id) {
		// TODO Auto-generated method stub
		return this.marqueRepository.findById(id).orElse(null);
	}



}
