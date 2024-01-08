package com.quiz.lesson04.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson04.domain.Realtor;

@Mapper
public interface RealtorMapper {
	
	// int: Realtor 	output: X
	public void insertRealtor(Realtor realtor);
	
	// int: id 	 output: Realtor
	public Realtor selectRealtorById(int id);
}
