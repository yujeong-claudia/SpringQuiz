package com.quiz.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson06/quiz01")
public class Lesson06Quiz01Controller {
	
	// http://localhost/lesson06/quiz01/add-bookmark-view
	// 즐겨찾기 추가하기
	@GetMapping("add-bookmark-view")
	public String addBookmarkView() {
		return "lesson06/addBookmark";
	}
	
	// 즐겨찾기 목록(insert) -> AJAX 요청
	// AJAX 가 요청하는 응답값은 반드시 String이다.
	@ResponseBody
	@PostMapping("/bookmark-list-view")
	public String bookmarkListView(
		@RequestParam("name") String name,
		@RequestParam("url") String url) {
			
		// db insert
		bookmarkBO.
			
		// 응답값 => String
		return "성공";
		}
	
	// 성공 화면
	@GetMapping("/after-add-bookmark-view")
	public String afterAddUserView() {
		return "lesson06/afterAddBookmark";
	}
	
}
