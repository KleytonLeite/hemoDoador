package com.homdoacao.api.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.homdoacao.api.entities.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
	
	@Query("SELECT obj FROM Candidato obj")
	Page<Candidato> findByPaged(PageRequest pageRequest);
	
}
