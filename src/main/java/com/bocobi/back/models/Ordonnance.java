package com.bocobi.back.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Table
@Entity	
public class Ordonnance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

		private Long idOrdonnance;
	
		private Date dateOrdonnance;
		
		private String detailsOrdonnance;
		
		// gestion de la migration des clés entre les tables
		//un patient peut recevoir zero ou plusieurs ordonnance
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "patient_id")
		private Patient patients;
		
		@ManyToMany(cascade = CascadeType.ALL)
		@JoinTable(name = "ordonnance_conseil",
					joinColumns = {@JoinColumn(name = "ordonnance_fk")},
					inverseJoinColumns = {@JoinColumn(name = "conseil_fk")})
		private List<Conseil> conseil = new ArrayList<>();

		public Long getIdOrdonnance() {
			return idOrdonnance;
		}

		public void setIdOrdonnance(Long idOrdonnance) {
			this.idOrdonnance = idOrdonnance;
		}

		public Date getDateOrdonnance() {
			return dateOrdonnance;
		}

		public void setDateOrdonnance(Date dateOrdonnance) {
			this.dateOrdonnance = dateOrdonnance;
		}

		public String getDetailsOrdonnance() {
			return detailsOrdonnance;
		}

		public void setDetailsOrdonnance(String detailsOrdonnance) {
			this.detailsOrdonnance = detailsOrdonnance;
		}

		public Patient getPatients() {
			return patients;
		}

		public void setPatients(Patient patients) {
			this.patients = patients;
		}

		public List<Conseil> getConseil() {
			return conseil;
		}

		public void setConseil(List<Conseil> conseil) {
			this.conseil = conseil;
		}
}
