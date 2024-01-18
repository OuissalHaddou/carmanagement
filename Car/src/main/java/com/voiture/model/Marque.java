package com.voiture.model;

import java.util.Set;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Marque")
public class Marque {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="libelleMarque",nullable=false)
	private String libelleMarque;
	
	
	@Column(name="description",nullable=true)
	private String description;
	

    @OneToMany(mappedBy = "voitureMarque",fetch = FetchType.LAZY)
    @JsonManagedReference(value="voitureMarque")
   	private Set<Voiture> ListeVoituresMarque;


	public Marque(Long id, String libelleMarque, String description, Set<Voiture> listeVoituresMarque) {
		super();
		this.id = id;
		this.libelleMarque = libelleMarque;
		this.description = description;
		this.ListeVoituresMarque = listeVoituresMarque;
	}


	public Marque() {
		
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLibelleMarque() {
		return libelleMarque;
	}


	public void setLibelleMarque(String libelleMarque) {
		this.libelleMarque = libelleMarque;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Set<Voiture> getListeVoituresMarque() {
		return ListeVoituresMarque;
	}


	public void setListeVoituresMarque(Set<Voiture> listeVoituresMarque) {
		this.ListeVoituresMarque = listeVoituresMarque;
	}
	    
    
	
}
