package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Teleconsultation;

public interface TeleconsultationRepos extends JpaRepository<Teleconsultation, Long> {

}
