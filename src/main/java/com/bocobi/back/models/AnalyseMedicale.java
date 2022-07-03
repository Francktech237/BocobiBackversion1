package com.bocobi.back.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Table
@Entity
public class AnalyseMedicale {

		@Id
		@GeneratedValue
		private Long idAnalyse;
		
		private Date dateAnalyse;
		
		private String designationAnalyse;
		
		
		
		

		public Long getIdAnalyse() {
			return idAnalyse;
		}

		public void setIdAnalyse(Long idAnalyse) {
			this.idAnalyse = idAnalyse;
		}

		public Date getDateAnalyse() {
			return dateAnalyse;
		}

		public void setDateAnalyse(Date dateAnalyse) {
			this.dateAnalyse = dateAnalyse;
		}

		public String getDesignationAnalyse() {
			return designationAnalyse;
		}

		public void setDesignationAnalyse(String designationAnalyse) {
			this.designationAnalyse = designationAnalyse;
		}
		
		
}
