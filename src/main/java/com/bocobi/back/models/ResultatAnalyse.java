package com.bocobi.back.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class ResultatAnalyse {

		@Id
		@GeneratedValue
		private Long idResultat;
		private String resultatAnalyse;
		private String refAnalyse;
		
		
		
		
		
		public Long getIdResultat() {
			return idResultat;
		}
		public void setIdResultat(Long idResultat) {
			this.idResultat = idResultat;
		}
		public String getResultatAnalyse() {
			return resultatAnalyse;
		}
		public void setResultatAnalyse(String resultatAnalyse) {
			this.resultatAnalyse = resultatAnalyse;
		}
		public String getRefAnalyse() {
			return refAnalyse;
		}
		public void setRefAnalyse(String refAnalyse) {
			this.refAnalyse = refAnalyse;
		}
}
