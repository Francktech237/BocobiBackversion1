package com.bocobi.back.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Pha")
public class Pharmacien extends Employe {
	
//	private Long idPharmacien;
	
	
//
//	public Long getIdPharmacien() {
//		return idPharmacien;
//	}
//
//	public void setIdPharmacien(Long idPharmacien) {
//		this.idPharmacien = idPharmacien;
//	}
}