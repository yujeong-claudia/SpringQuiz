package com.quiz.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.RealEstate;
import com.quiz.lesson03.mapper.RealEstateMapper;

@Service
public class RealEstateBO {

	@Autowired
	private RealEstateMapper realEstateMapper;
	
	// input:id		output: RealEstate(있거나 또는 null)
	public RealEstate getRealEstateByid(int id) {
		return realEstateMapper.selectRealEstateByid(id);
	};
	
	// input:rentPrice		output: List<RealEstate> ([비워져있거나] or 채워져있거나 , null은 아님)
	public List<RealEstate> getRealEstateListByRentPrice(int rentPrice) {
		return realEstateMapper.selectRealEstateListByRentPrice(rentPrice);
	};
}
