package com.voiture.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.voiture.model.Model;



@Service
public interface ModelService {
	
	public Model saveModel(Model model);
	
	public Model updateModel(Model  model);
	
	public String deleteModelById(Long id);
	
	public String deleteModelByObject(Model model);

	public List<Model> getAllModel();

	public Model findModelById(Long id) ;
}
