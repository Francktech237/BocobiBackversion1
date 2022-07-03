package com.bocobi.back.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "patient")

//pour gerer la relation d'heritage entre classe patient et classe personne
@PrimaryKeyJoinColumn(name = "fk_idPersonne",referencedColumnName = "idPersonne")
public class Patient extends Personne {
	
	
	private int age;
	private float taille;
	private float temperature;
	private float pressionArterielle;
	private Date dateNaissance;
	private String lieuResidence;
	private String profession;
	private String statutMatrimonial;
	
	//annotation @OneToOne ne peut etre utiliser sur des string,int,long
	//Annotations @ManyToOne et ne peuvent être utilisés @OneToManyque @ManyToManysur des attributs qui sont d'autres entités. Il ne doit pas être utilisé dans les attributs String, int, long, etc.
	
	@OneToMany(mappedBy = "patients" )
	private List<Consultation> consultation = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "patients")
	private List<Allergie> allergie = new  ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="patients")
	private List<RendezVous> rendezVous = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="patients")
	private List<Ordonnance> ordonnance = new ArrayList<>();
	
	@OneToOne
	@JoinTable(name = "patient_abonnement",
				joinColumns = {@JoinColumn(name = "patient_id")},
				inverseJoinColumns = {@JoinColumn(name = "abonnement_id")})

	public Abonnement abonnement;
	
	
	
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLieuResidence() {
		return lieuResidence;
	};
	public void setLieuResidence(String lieuResidence) {
		this.lieuResidence = lieuResidence;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStatutMatrimonial() {
		return statutMatrimonial;
	}
	public void setStatutMatrimonial(String statutMatrimonial) {
		this.statutMatrimonial = statutMatrimonial;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getPressionArterielle() {
		return pressionArterielle;
	}
	public void setPressionArterielle(float pressionArterielle) {
		this.pressionArterielle = pressionArterielle;
	}
	public float getTaille() {
		return taille;
	}
	public void setTaille(float taille) {
		this.taille = taille;
	}
	public Abonnement getAbonnement() {
		return abonnement;
	}
	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}
	public List<Allergie> getAllergie() {
		return allergie;
	}
	public void setAllergie(List<Allergie> allergie) {
		this.allergie = allergie;
	}
	public List<RendezVous> getRendezVous() {
		return rendezVous;
	}
	public void setRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}
	public List<Consultation> getConsultation() {
		return consultation;
	}
	public void setConsultation(List<Consultation> consultation) {
		this.consultation = consultation;
	}
		
}
