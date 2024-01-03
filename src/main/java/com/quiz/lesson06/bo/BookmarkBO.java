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
}
