package com.voiture.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.voiture.model.Voiture;
import com.voiture.services.VoitureService;




@RestController
@RequestMapping("/Voiture")
@CrossOrigin("*")
public class VoitureController {
	@Autowired
	public VoitureService voitureService;
	
	@RequestMapping(value="/ajouterVoiture",method= RequestMethod.POST,headers="accept=Application/json")
	public Voiture save(@RequestBody Voiture voiture) {
		try {
			voiture=this.voitureService.saveVoiture(voiture);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return voiture;
		
	}
	
	@RequestMapping(value="/getAllVoitures",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Voiture> getAll() {
		List<Voiture> voitures=new ArrayList<>();
		try {
			voitures=this.voitureService.getAllVoiture();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return voitures;
		
	}
	
	@RequestMapping(value="/updateVoiture",method= RequestMethod.PUT,headers="accept=Application/json")
	public Voiture update(@RequestBody Voiture voiture) {
		try {
			voiture=this.voitureService.updateVoiture(voiture);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return voiture;
		
	}
	
	@RequestMapping(value = "/deleteVoiture", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Voiture voiture){
		 return this.voitureService.deleteVoitureByObject(voiture);
	}

	
	@RequestMapping(value = "/deleteVoiture/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.voitureService.deleteVoitureById(id);
	}
	
	
	
	@RequestMapping(value = "/findVoitureById/{id}", method =RequestMethod.GET)
	public Voiture findById(@PathVariable("id") long id){
		 return this.voitureService.findVoitureById(id);
	}


}
