package com.bocobi.back.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class ModePaiement {
	
	@Id
	@GeneratedValue
	
	private Long idPaiement;
	
	private String libellePaiement;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "abonnement_id" )
	
	private Abonnement abonnement;
	
	public Long getIdPaiement() {
		return idPaiement;
	}

	public void setIdPaiement(Long idPaiement) {
		this.idPaiement = idPaiement;
	}

	public String getLibellePaiement() {
		return libellePaiement;
	}

	public void setLibellePaiement(String libellePaiement) {
		this.libellePaiement = libellePaiement;
	}

	public Abonnement getAbonnement() {
		return abonnement;
	}

	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}

	
	
}
