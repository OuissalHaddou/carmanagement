package com.voiture.model;

import jakarta.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="PersonneType")
@Table(name = "Personne")
public class Personne {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name="nom",nullable = false)
    protected String nom;

    @Column(name="prenom",nullable = false)
    protected String prenom;
   
    @Column(name="adresse",nullable = false)
    protected String adresse;
    
    @Column(name="numtel",nullable = false)
    protected int numtel;

	public Personne(Long id, String nom, String prenom, String adresse, int numtel) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numtel = numtel;
	}
	
	public Personne() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNumtel() {
		return numtel;
	}

	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numtel="
				+ numtel + "]";
	}

    
}
