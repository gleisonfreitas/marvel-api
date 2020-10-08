package com.api.marvel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.marvel.domain.model.Characther;

@Repository
public interface CharactherRepository extends JpaRepository<Characther, Long>{
	
}
