package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.bocobi.back.models.Personne;

@NoRepositoryBean
public interface PersonneRepository<T extends Personne> extends JpaRepository<T, Long> {

}
