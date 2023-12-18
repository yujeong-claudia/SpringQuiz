package com.quiz.lesson03.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.quiz.lesson03.domain.RealEstate;

@Repository
public interface RealEstateMapper {
	
	// input:id		output: RealEstate(있거나 또는 null)
	public RealEstate selectRealEstateByid(int id);
	
	// input:rentPrice		output: List<RealEstate> ([비워져있거나] or 채워져있거나 , null은 아님)
	public List<RealEstate> selectRealEstateListByRentPrice(int rentPrice);
}
