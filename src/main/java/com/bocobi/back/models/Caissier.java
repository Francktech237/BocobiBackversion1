package com.bocobi.back.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Caissier")
@DiscriminatorValue("Cai")
public class Caissier extends Employe{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long idCaissier;
	//private String service;
	//private int heureFontion;
//
//	public Long getIdCaissier() {
//		return idCaissier;
//	}
//
//	public void setIdCaissier(Long idCaissier) {
//		this.idCaissier = idCaissier;
//	}
//	public String getService() {
	//	return service;
//	}
//	public void setService(String service) {
//		this.service = service;
//	}
//	public int getHeureFontion() {
//		return heureFontion;
//	}
//	public void setHeureFontion(int heureFontion) {
//		this.heureFontion = heureFontion;
//	}
}
