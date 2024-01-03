package com.quiz.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.domain.Bookmark;
import com.quiz.lesson06.mapper.BookmarkMapper;

@Service
public class BookmarkBO {

	@Autowired
	private BookmarkMapper bookmarkMapper;
	
	// input:title, url      output:x
	public void addBookmark(String name, String address) {
		bookmarkMapper.insertBookmark(name, address);
	}
	
	public List<Bookmark> getBookmarkList() {
		return bookmarkMapper.selectBookmarkList();
	}
	
	//input:url  		output:boolean
	public boolean isDuplicationUrl(String address) {
		// 중복 없음: [], 중복이면 리스트는 채워짐
		List<Bookmark> bookmarkList = bookmarkMapper.selectBookmarkListByAddress(address);
		return bookmarkList.isEmpty() ? false : true;
		//return !bookmarkList.isEmpty();
	}
	
	public int deleteBookmarkById(int id) {
		return bookmarkMapper.deleteBookmarkById(id);
	}
}
