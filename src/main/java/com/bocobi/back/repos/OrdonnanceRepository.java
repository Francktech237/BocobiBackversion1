package com.bocobi.back.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Ordonnance;

public interface OrdonnanceRepository extends JpaRepository<Ordonnance, Long> {

	

	List<Ordonnance> findByIdOrdonnance(Long idOrdonnance);

	//List<Ordonnance> findByIdOrdonnance(Long idOrdonnance);



}
