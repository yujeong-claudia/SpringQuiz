package com.quiz.lesson07.repository;

import org.springframework.stereotype.Repository;

import com.quiz.lesson07.entity.CompanyEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class CompanyRespository {
	// JPA, Spring Data JPA
	@PersistenceContext
	private EntityManager em;
	
	public CompanyEntity save(CompanyEntity companyEntity) {
		em.persist(companyEntity);
		return companyEntity;
	}
}
