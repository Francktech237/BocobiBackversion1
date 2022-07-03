package com.bocobi.back.models;

import java.sql.Date;

import javax.persistence.*;

@Table
@Entity	
public class Consultation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long idConsult;
	
	private String OrigineConsult;
	
	private String diagnosticMaladie;
	
	private Date dateConsult;
	
	private String synthese;
	
	//un patient peut etre consulter plusieurs fois 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "typeConsultation_id" )
	
	private TypeConsultation typeConsultation;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id" ) 
	private Patient patients;
	
	public Long getIdConsult() {
		return idConsult;
	}
	public void setIdConsult(Long idConsult) {
		this.idConsult = idConsult;
	}
	
	public String getDiagnosticMaladie() {
		return diagnosticMaladie;
	}
	public void setDiagnosticMaladie(String diagnosticMaladie) {
		this.diagnosticMaladie = diagnosticMaladie;
	}
	public Date getDateConsult() {
		return dateConsult;
	}
	public void setDateConsult(Date dateConsult) {
		this.dateConsult = dateConsult;
	}
	public String getOrigineConsult() {
		return OrigineConsult;
	}
	public void setOrigineConsult(String origineConsult) {
		OrigineConsult = origineConsult;
	}
	public String getSynthese() {
		return synthese;
	}
	public void setSynthese(String synthese) {
		this.synthese = synthese;
	}
	public Patient getPatients() {
		return patients;
	}
	public void setPatients(Patient patients) {
		this.patients = patients;
	}
	public TypeConsultation getTypeConsultation() {
		return typeConsultation;
	}
	public void setTypeConsultation(TypeConsultation typeConsultation) {
		this.typeConsultation = typeConsultation;
	}
	
}
