package com.bocobi.back.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bocobi.back.models.Compte;

@Repository
public interface CompteRepository extends JpaRepository <Compte, Long>{

	List<Compte> findByLogin(String login);

	List<Compte> findByIdCompte(Long idCompte);

//	Compte deleteByIdCompte(Long idCompte);

		
}
