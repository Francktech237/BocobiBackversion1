package com.bocobi.back.repos;

import java.sql.Date;
import java.util.List;

import com.bocobi.back.models.Caissier;

public interface CaissierRepository extends PersonneRepository <Caissier> {

	List<Caissier> findByMatricule(String matricule);

	List<Caissier> findByDateEnregistrement(Date dateEnregistrement);

}
