package com.bocobi.back.models;

import java.util.Date;

import javax.persistence.*;

@Table
@Entity
public class RendezVous {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRdv;

	private Date dateRdv;

	private Date heureRdv;
	
	//un patient peut avoir plusieurs rendez vous
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id" )
	
	public Patient patients;
	

	public Long getIdRdv() {
		return idRdv;
	}

	public void setIdRdv(Long idRdv) {
		this.idRdv = idRdv;
	}

	public Date getDateRdv() {
		return dateRdv;
	}

	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}

	public Date getHeureRdv() {
		return heureRdv;
	}

	public void setHeureRdv(Date heureRdv) {
		this.heureRdv = heureRdv;
	}

	public Patient getPatient() {
		return patients;
	}

	public void setPatient(Patient patient) {
		this.patients = patient;
	}
}
