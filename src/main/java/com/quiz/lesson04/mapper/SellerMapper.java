package com.quiz.lesson04.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson04.domain.Seller;

@Repository
public interface SellerMapper {
	
	//1
	public void insertSeller(
			@Param("nickname") String nickname, 
			@Param("profileImageUrl") String profileImageUrl, 
			@Param("temperature") double temperature);
	
	//2
	public Seller selectLatestSeller();
	
	//3
	public Seller selectSellerById(int id);
}
