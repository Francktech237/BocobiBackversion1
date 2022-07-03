package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Examen;

public interface ExamenRepos extends JpaRepository<Examen, Long> {

}
