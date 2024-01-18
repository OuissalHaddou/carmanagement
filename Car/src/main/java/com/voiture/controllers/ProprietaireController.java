package com.voiture.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.voiture.model.Proprietaire;
import com.voiture.services.ProprietaireService;




@RestController
@RequestMapping("/Proprietaire")
@CrossOrigin("*")
public class ProprietaireController {
	@Autowired
	public ProprietaireService proprietaireService;
	
	@RequestMapping(value="/ajouterProprietaire",method= RequestMethod.POST,headers="accept=Application/json")
	public Proprietaire save(@RequestBody Proprietaire proprietaire) {
		try {
			proprietaire=this.proprietaireService.saveProprietaire(proprietaire);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return proprietaire;
		
	}
	
	@RequestMapping(value="/getAllProprietaires",method= RequestMethod.GET,headers="accept=Application/json")
	public List<Proprietaire> getAll() {
		List<Proprietaire> proprietaires=new ArrayList<>();
		try {
			proprietaires=this.proprietaireService.getAllProprietaire();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return proprietaires;
		
	}
	
	@RequestMapping(value="/updateProprietaire",method= RequestMethod.PUT,headers="accept=Application/json")
	public Proprietaire update(@RequestBody Proprietaire proprietaire) {
		try {
			proprietaire=this.proprietaireService.updateProprietaire(proprietaire);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return proprietaire;
		
	}
	
	@RequestMapping(value = "/deleteProprietaire", method =RequestMethod.DELETE)
	public String DeleteByObject(@RequestBody Proprietaire proprietaire){
		 return this.proprietaireService.deleteProprietaireByObject(proprietaire);
	}

	
	@RequestMapping(value = "/deleteProprietaire/{id}", method =RequestMethod.DELETE)
	public String DeleteById(@PathVariable("id") long id){
		 return this.proprietaireService.deleteProprietaireById(id);
	}
	
	
	
	@RequestMapping(value = "/findProprietaireById/{id}", method =RequestMethod.GET)
	public Proprietaire findById(@PathVariable("id") long id){
		 return this.proprietaireService.findProprietaireById(id);
	}

	
	
	@RequestMapping(value = "/findProprietaireByNomProprietaire", method =RequestMethod.GET)
	public Proprietaire findByNomProprietaire(@RequestBody String NomProprietaire){
		 return this.proprietaireService.findProprietaireByNom(NomProprietaire);
	}
}
