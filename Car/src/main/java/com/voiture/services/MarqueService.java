package com.voiture.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.model.Marque;


@Service
public interface MarqueService {
	
	public Marque saveMarque(Marque marque);
	
	public Marque updateMarque(Marque  marque);
	
	public String deleteMarqueById(Long id);
	
	public String deleteMarqueByObject(Marque marque);

	public List<Marque> getAllMarque();

	public Marque findMarqueById(Long id) ;
	
}
