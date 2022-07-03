package com.bocobi.back.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table
@Entity
public class Admin {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)

		private Long idAdmin;

		public Long getIdAdmin() {
			return idAdmin;
		}

		public void setIdAdmin(Long idAdmin) {
			this.idAdmin = idAdmin;
		}
		
}
