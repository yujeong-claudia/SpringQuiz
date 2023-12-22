package com.quiz.lesson04.mapper;

import org.springframework.stereotype.Repository;

import com.quiz.lesson04.domain.Realtor;

@Repository
public interface RealtorMapper {
	
	// int: Realtor 	output: X
	public void insertRealtor(Realtor realtor);
	
	// int: id 	 output: Realtor
	public Realtor selectRealtorById(int id);
}
