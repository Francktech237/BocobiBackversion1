package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Facture;

public interface FactureRepos extends JpaRepository<Facture, Long>{

}
