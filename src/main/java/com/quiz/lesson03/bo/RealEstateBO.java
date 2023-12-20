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
	
	// input:area, price	output: List<RealEstate> [] or 채워져있다.
	public List<RealEstate> getRealEstateListByAreaAndPrice(int area, int price) {
		return realEstateMapper.selectRealEstateListByAreaAndPrice(area, price);
	}
	
	// input: RealEstate
	// output: 성공한 행의 개수(int)
	public int addRealEstate(RealEstate realEstate) {
		return realEstateMapper.insertRealEstate(realEstate);
	}
	//addRealEstateAsField(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
	public int addRealEstateAsField(
			int realtorId, String address, 
			int area, String type, 
			int price, Integer rentPrice
			) {
		return realEstateMapper.insertRealEstateAsField(realtorId, address, area, type, price, rentPrice);
	}
	
	//updateRealEstateBO
	public int updateRealEstateByIdTypePrice(int id, String type, int price) {
		return realEstateMapper.updateRealEstateByIdTypePrice(id, type, price);
	}
}
