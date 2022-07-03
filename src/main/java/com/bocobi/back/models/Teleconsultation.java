package com.bocobi.back.models;

import java.util.Date;

import javax.persistence.*;

@Table
@Entity
public class Teleconsultation {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long idTeleconsultation;
	
	private Date DateTeleconsultation;

	private Date heureTeleconsultation;
/*
	@OneToOne(mappedBy="teleconsultation")
	@JoinColumn(name="idFacture")
	private Facture facture;
	
	@ManyToOne
	@JoinColumn(name= "idPatient")
	private Patient patient;
	
	@ManyToOne  
	@JoinColumn(name="idMedecin")
	private Medecin medecin;
    */
	//permet de faire migrer id_abonnement dans la table teleconsultation
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "abonnement_id" )
	
	private Abonnement abonnement;

	public Long getIdTeleconsultation() {
		return idTeleconsultation;
	}

	public void setIdTeleconsultation(Long idTeleconsultation) {
		this.idTeleconsultation = idTeleconsultation;
	}

	public Date getDateTeleconsultation() {
		return DateTeleconsultation;
	}

	public void setDateTeleconsultation(Date dateTeleconsultation) {
		DateTeleconsultation = dateTeleconsultation;
	}

	public Date getHeureTeleconsultation() {
		return heureTeleconsultation;
	}

	public void setHeureTeleconsultation(Date heureTeleconsultation) {
		this.heureTeleconsultation = heureTeleconsultation;
	}

	public Abonnement getAbonnement() {
		return abonnement;
	}

	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}
}
