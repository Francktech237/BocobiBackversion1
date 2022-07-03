package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Admin;

public interface AdminRepos extends  JpaRepository<Admin, Long>{

}
