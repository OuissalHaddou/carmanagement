package com.voiture.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.voiture.model.Model;
import com.voiture.services.ModelService;




@RestController
@RequestMapping("/Model")
@CrossOrigin("*")
public class ModelController {
	@Autowired
	public ModelService modelService;
	
	@RequestMapping(value="/ajouterModel",method= RequestMethod.POST,headers="accept=Application/json")
	public Model save(@RequestBody Model model) {
		try {
			model=this.modelService.saveModel(model);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return model;
		
	}
	
	@RequestMapping(value="/getAllModels",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Model> getAll() {
		List<Model> models=new ArrayList<>();
		try {
			models=this.modelService.getAllModel();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return models;
		
	}
	
	@RequestMapping(value="/updateModel",method= RequestMethod.PUT,headers="accept=Application/json")
	public Model update(@RequestBody Model model) {
		try {
			model=this.modelService.updateModel(model);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return model;
		
	}
	
	@RequestMapping(value = "/deleteModel", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Model model){
		 return this.modelService.deleteModelByObject(model);
	}

	
	@RequestMapping(value = "/deleteModel/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.modelService.deleteModelById(id);
	}
	
	
	
	@RequestMapping(value = "/findModelById/{id}", method =RequestMethod.GET)
	public Model findById(@PathVariable("id") long id){
		 return this.modelService.findModelById(id);
	}


}
