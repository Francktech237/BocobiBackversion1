package com.bocobi.back.repos;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bocobi.back.models.Medecin;

@Repository
public interface MedecinRepository extends PersonneRepository<Medecin> {

	List<Medecin> findByname(String name);

	 List<Medecin> findByIdPersonne(Long idPersonne);

	List<Medecin> findByDateEnregistrement(Date dateEnregistrement);


		

}
