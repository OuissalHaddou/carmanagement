package com.voiture.model;

import java.util.Date;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table(name = "LouerVoiture")
public class LouerVoiture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne()
	@JsonBackReference(value="voitureLouerVoiture")
    @JoinColumn(name = "voitureId")
    private Voiture voitureLouer;
    
    @ManyToOne()
    @JsonBackReference(value="locataireLouerVoiture")
    @JoinColumn(name = "locataireId")
    private Locataire locataireLouer;
	    
	@Column(name="dateLocation",nullable=false)
	private Date dateLocation;

	public LouerVoiture(Long id, Voiture voitureLouer, Locataire locataireLouer, Date dateLocation) {
		super();
		this.id = id;
		this.voitureLouer = voitureLouer;
		this.locataireLouer = locataireLouer;
		this.dateLocation = dateLocation;
	}
	
	

	public LouerVoiture() {
		
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Voiture getVoitureLouer() {
		return voitureLouer;
	}

	public void setVoitureLouer(Voiture voitureLouer) {
		this.voitureLouer = voitureLouer;
	}

	public Locataire getLocataireLouer() {
		return locataireLouer;
	}

	public void setLocataireLouer(Locataire locataireLouer) {
		this.locataireLouer = locataireLouer;
	}

	public Date getDateLocation() {
		return dateLocation;
	}

	public void setDateLocation(Date dateLocation) {
		this.dateLocation = dateLocation;
	}

	

}
