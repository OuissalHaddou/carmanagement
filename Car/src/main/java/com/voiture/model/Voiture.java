package com.voiture.model;

import java.util.Set;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "Voiture")
public class Voiture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="libelleVoiture",nullable=false)
	private String libelleVoiture;
	
	
	@Column(name="couleur",nullable=false)
	private String couleur;
	
	
	@Column(name="statut",nullable=false)
	private String statut;
	
	
	@Column(name="nombreSiege",nullable=false)
	private Integer nombreSiege;
	
	
	@Column(name="image",nullable=true)
	private String image;
	
	
	@Column(name="motorisation",nullable=false)
	private String motorisation;
	
	
    @ManyToOne()
    @JsonBackReference(value="voitureProprietaire")
    @JoinColumn(name = "proprietaireId")
    private Proprietaire voitureProprietaire;
    
    
    @OneToMany(mappedBy = "voitureLouer",fetch = FetchType.LAZY)
    @JsonManagedReference(value="voitureLouerVoiture")
   	private Set<LouerVoiture> listeLocationsVoiture;
    
    
    @ManyToOne()
    @JsonBackReference(value="voitureMarque")
    @JoinColumn(name = "marqueId")
    private Marque voitureMarque;

    
    @ManyToOne()
    @JsonBackReference(value="voitureModel")
    @JoinColumn(name = "modelId")
    private Model voitureModel;


	public Voiture(Long id, String libelleVoiture, String couleur, String statut, Integer nombreSiege, String image,
			String motorisation, Proprietaire voitureProprietaire, Set<LouerVoiture> listeLocationsVoiture,
			Marque voitureMarque, Model voitureModel) {
		super();
		this.id = id;
		this.libelleVoiture = libelleVoiture;
		this.couleur = couleur;
		this.statut = statut;
		this.nombreSiege = nombreSiege;
		this.image = image;
		this.motorisation = motorisation;
		this.voitureProprietaire = voitureProprietaire;
		this.listeLocationsVoiture = listeLocationsVoiture;
		this.voitureMarque = voitureMarque;
		this.voitureModel = voitureModel;
	}

	public Voiture() {
		
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLibelleVoiture() {
		return libelleVoiture;
	}


	public void setLibelleVoiture(String libelleVoiture) {
		this.libelleVoiture = libelleVoiture;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public Integer getNombreSiege() {
		return nombreSiege;
	}


	public void setNombreSiege(Integer nombreSiege) {
		this.nombreSiege = nombreSiege;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getMotorisation() {
		return motorisation;
	}


	public void setMotorisation(String motorisation) {
		this.motorisation = motorisation;
	}


	public Proprietaire getVoitureProprietaire() {
		return voitureProprietaire;
	}


	public void setVoitureProprietaire(Proprietaire voitureProprietaire) {
		this.voitureProprietaire = voitureProprietaire;
	}


	public Set<LouerVoiture> getListeLocationsVoiture() {
		return listeLocationsVoiture;
	}


	public void setListeLocationsVoiture(Set<LouerVoiture> listeLocationsVoiture) {
		this.listeLocationsVoiture = listeLocationsVoiture;
	}


	public Marque getVoitureMarque() {
		return voitureMarque;
	}


	public void setVoitureMarque(Marque voitureMarque) {
		this.voitureMarque = voitureMarque;
	}


	public Model getVoitureModel() {
		return voitureModel;
	}


	public void setVoitureModel(Model voitureModel) {
		this.voitureModel = voitureModel;
	}


	@Override
	public String toString() {
		return "Voiture [id=" + id + ", libelleVoiture=" + libelleVoiture + ", couleur=" + couleur + ", statut="
				+ statut + ", nombreSiege=" + nombreSiege + ", image=" + image + ", motorisation=" + motorisation
				+ ", voitureProprietaire=" + voitureProprietaire + ", listeLocationsVoiture=" + listeLocationsVoiture
				+ ", voitureMarque=" + voitureMarque + ", voitureModel=" + voitureModel + "]";
	}


	
    
    
}
