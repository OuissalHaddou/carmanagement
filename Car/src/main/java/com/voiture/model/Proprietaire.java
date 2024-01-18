package com.voiture.model;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Proprietaire")
@DiscriminatorValue("Proprietaire")
public class Proprietaire extends Personne{

	/*Ajout de la relation OneToMany entre Proprietaire et Voiture*/
    @OneToMany(mappedBy = "voitureProprietaire", fetch =  FetchType.LAZY)
    @JsonManagedReference(value="voitureProprietaire")
    private Set<Voiture> voitures;

	public Proprietaire(Long id, String nom, String prenom, String adresse, int numtel, Set<Voiture> voitures) {
		super(id, nom, prenom, adresse, numtel);
		this.voitures = voitures;
	}
	
	public Proprietaire() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(voitures);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietaire other = (Proprietaire) obj;
		return Objects.equals(voitures, other.voitures);
	}

	public Set<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(Set<Voiture> voitures) {
		this.voitures = voitures;
	}
    
	
    
}
