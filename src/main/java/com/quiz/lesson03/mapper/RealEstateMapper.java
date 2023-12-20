package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson03.domain.RealEstate;

@Repository
public interface RealEstateMapper {

	// input:id output: RealEstate(있거나 또는 null)
	public RealEstate selectRealEstateByid(int id);

	// input:rentPrice output: List<RealEstate> ([비워져있거나] or 채워져있거나 , null은 아님)
	public List<RealEstate> selectRealEstateListByRentPrice(int rentPrice);

	// input:area, price output: List<RealEstate> [] or 채워져있다.
	public List<RealEstate> selectRealEstateListByAreaAndPrice(
			// myBatis 문법 상 파라미터는 단 한개만 xml로 보낼 수 있다.
			// 파라미터들은 하나의 맵에 담아서 보낸다.
			// 맵으로 만들어주는 어노테이션 @Param
			// 하나일 때도 어노테이션을 만들어도 된다. 하지만 굳이 만들 필요가 없으므로 안만든다.
			// 요청이 아니므로 request하고는 아무런 상관이 없다.
			// int 변수명, 는 아무런 상관이 없다. ("") key 값만 중요하다.
			@Param("area") int area, @Param("price") int price);

	// input: RealEstate
	// output: 성공한 행의 개수(int)
	public int insertRealEstate(RealEstate realEstate);
	
	
	public int insertRealEstateAsField(
			@Param("realtorId") int realtorId,
			@Param("address") String address, 
			@Param("area") int area,
			@Param("type") String type, 
			@Param("price") int price, 
			@Param("rentPrice") Integer rentPrice
			);
	
	public int updateRealEstateByIdTypePrice(
			@Param("id") int id, 
			@Param("type") String type, 
			@Param("price") int price);
}
