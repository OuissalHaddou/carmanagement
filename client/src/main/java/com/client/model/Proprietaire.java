package com.client.model;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name = "Proprietaire")
@DiscriminatorValue("Proprietaire")
public class Proprietaire extends Personne{



	public Proprietaire(Long id, String nom, String prenom, String adresse, int numtel) {
		super(id, nom, prenom, adresse, numtel);
	}
	
	public Proprietaire() {
		
	}


}
