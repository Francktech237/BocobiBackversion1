package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Consultation;

public interface ConsultationRepos extends JpaRepository<Consultation, Long> {

}
