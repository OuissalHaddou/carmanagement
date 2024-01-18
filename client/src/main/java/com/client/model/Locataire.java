package com.client.model;

import java.util.Set;

import jakarta.persistence.*;




@Entity
@Table(name = "Locataire")
@DiscriminatorValue("Locataire")
public class Locataire extends Personne{


	public Locataire(Long id, String nom, String prenom, String adresse, int numtel) {
		super(id, nom, prenom, adresse, numtel);
	}

	public Locataire() {

	}







    
    
}
