package com.voiture.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.voiture.model.Locataire;
import com.voiture.services.LocataireService;



@RestController
@RequestMapping("/Locataire")
@CrossOrigin("*")
public class LocataireController {
	@Autowired
	public LocataireService locataireService;
	
	@RequestMapping(value="/ajouterLocataire",method= RequestMethod.POST,headers="accept=Application/json")
	public Locataire save(@RequestBody Locataire locataire) {
		try {
			locataire=this.locataireService.saveLocataire(locataire);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return locataire;
		
	}
	
	@RequestMapping(value="/getAllLocataires",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Locataire> getAll() {
		List<Locataire> locataires=new ArrayList<>();
		try {
			locataires=this.locataireService.getAllLocataire();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return locataires;
		
	}
	
	@RequestMapping(value="/updateLocataire",method= RequestMethod.PUT,headers="accept=Application/json")
	public Locataire update(@RequestBody Locataire locataire) {
		try {
			locataire=this.locataireService.updateLocataire(locataire);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return locataire;
		
	}
	
	@RequestMapping(value = "/deleteLocataire", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Locataire locataire){
		 return this.locataireService.deleteLocataireByObject(locataire);
	}

	
	@RequestMapping(value = "/deleteLocataire/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.locataireService.deleteLocataireById(id);
	}
	
	
	
	@RequestMapping(value = "/findLocataireById/{id}", method =RequestMethod.GET)
	public Locataire findById(@PathVariable("id") long id){
		 return this.locataireService.findLocataireById(id);
	}

	
	
	@RequestMapping(value = "/findLocataireByNomLocataire", method =RequestMethod.GET)
	public Locataire findByNomLocataire(@RequestBody String NomLocataire){
		 return this.locataireService.findLocataireByNom(NomLocataire);
	}
}
