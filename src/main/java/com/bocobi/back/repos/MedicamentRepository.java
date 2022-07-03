package com.bocobi.back.repos;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bocobi.back.models.Medicament;
@Repository
public interface MedicamentRepository extends JpaRepository<Medicament, Long>{

	List<Medicament> findByPrixMedicament(Float prixMedicament);

	List<Medicament> findByLibelleMedicament(String libelleMedicament);

	List<Medicament> findByDatePeremption(Date datePeremption);

	Medicament deleteByIdMedicament(Long idMedicament);

}
