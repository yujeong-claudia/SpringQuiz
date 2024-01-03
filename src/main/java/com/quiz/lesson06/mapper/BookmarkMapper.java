package com.quiz.lesson06.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson06.domain.Bookmark;

@Repository
public interface BookmarkMapper {

	public void insertBookmark(
			@Param("name") String name, 
			@Param("address") String address);
	
	public List<Bookmark> selectBookmarkList();
	
	//input:address		output:List<Bookmark>
	public List<Bookmark> selectBookmarkListByAddress(String address);
	
	public int deleteBookmarkById(int id);
}
