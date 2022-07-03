package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Conseil;

public interface ConseilRepos extends JpaRepository<Conseil, Long> {

}
