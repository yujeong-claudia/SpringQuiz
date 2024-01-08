package com.quiz.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson02.domain.Store;

@Mapper
public interface StoreMapper {
	
	// input:X (BO한테 요청받음)	
	// output: List<Store> (BO한테 돌려준다)
	public List<Store> selectStoreList();
}
