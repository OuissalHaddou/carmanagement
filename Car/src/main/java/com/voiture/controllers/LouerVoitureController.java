package com.voiture.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.voiture.model.LouerVoiture;
import com.voiture.services.LouerVoitureService;



@RestController
@RequestMapping("/LouerVoiture")
@CrossOrigin("*")
public class LouerVoitureController {
	@Autowired
	public LouerVoitureService louerVoitureService;
	
	@RequestMapping(value="/ajouterLouerVoiture",method= RequestMethod.POST,headers="accept=Application/json")
	public LouerVoiture save(@RequestBody LouerVoiture louerVoiture) {
		try {
			louerVoiture=this.louerVoitureService.saveLouerVoiture(louerVoiture);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return louerVoiture;
		
	}
	
	@RequestMapping(value="/getAllLouerVoitures",method= RequestMethod.GET,headers="accept=Application/json")
	public List<LouerVoiture> getAll() {
		List<LouerVoiture> louerVoitures=new ArrayList<>();
		try {
			louerVoitures=this.louerVoitureService.getAllLouerVoiture();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return louerVoitures;
		
	}
	
	@RequestMapping(value="/updateLouerVoiture",method= RequestMethod.PUT,headers="accept=Application/json")
	public LouerVoiture update(@RequestBody LouerVoiture louerVoiture) {
		try {
			louerVoiture=this.louerVoitureService.updateLouerVoiture(louerVoiture);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return louerVoiture;
		
	}
	
	@RequestMapping(value = "/deleteLouerVoiture", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody LouerVoiture louerVoiture){
		 return this.louerVoitureService.deleteLouerVoitureByObject(louerVoiture);
	}

	
	@RequestMapping(value = "/deleteLouerVoiture/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.louerVoitureService.deleteLouerVoitureById(id);
	}
	
	
	
	@RequestMapping(value = "/findLouerVoitureById/{id}", method =RequestMethod.GET)
	public LouerVoiture findById(@PathVariable("id") long id){
		 return this.louerVoitureService.findLouerVoitureById(id);
	}


}
