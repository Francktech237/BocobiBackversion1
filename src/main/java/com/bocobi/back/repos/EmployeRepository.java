package com.bocobi.back.repos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bocobi.back.models.Employe;

@Repository
public interface EmployeRepository extends PersonneRepository<Employe> {

	List<Employe> findByIdPersonne(Long idPersonne);

	List<Employe> findByGradeEmploye(String gradeEmploye);

	List<Employe> findByMatricule(String matricule);

}
