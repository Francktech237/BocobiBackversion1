package com.bocobi.back.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Prescription {
	
	@Id
	@GeneratedValue
	private Long idPrescription;
	private Date datePrescription;
	private String notePrescription;
	
	
	
	
	public Long getIdPrescription() {
		return idPrescription;
	}
	public void setIdPrescription(Long idPrescription) {
		this.idPrescription = idPrescription;
	}
	public Date getDatePrescription() {
		return datePrescription;
	}
	public void setDatePrescription(Date datePrescription) {
		this.datePrescription = datePrescription;
	}
	public String getNotePrescription() {
		return notePrescription;
	}
	public void setNotePrescription(String notePrescription) {
		this.notePrescription = notePrescription;
	}

}
