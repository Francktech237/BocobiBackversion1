package com.bocobi.back.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class Abonnement {
	
	@Id
	@GeneratedValue
	public Long idAb;
	private Date dateDebut;	
	private Date dateFin;
	private Float prix;
	private String nom;
	private String description;
	
	//gestion des migrations des cles entre les differentes tables
	
	// un utilisateur souscrit a un abonnement
	@OneToMany(mappedBy ="abonnement")
	
	private List<ModePaiement> modePaiement = new ArrayList<>();
	
	//permet de faire une relation entre teleconsultation et abonnement
	@OneToMany(mappedBy ="abonnement")
	
	private List<Teleconsultation> teleconsultation = new ArrayList<>();
	
	
	public Long getIdAb() {
		return idAb;
	}
	public void setIdAb(Long idAb) {
		this.idAb =  idAb;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<ModePaiement> getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(List<ModePaiement> modePaiement) {
		this.modePaiement = modePaiement;
	}
	public List<Teleconsultation> getTeleconsultation() {
		return teleconsultation;
	}
	public void setTeleconsultation(List<Teleconsultation> teleconsultation) {
		this.teleconsultation = teleconsultation;
	}
	
}
