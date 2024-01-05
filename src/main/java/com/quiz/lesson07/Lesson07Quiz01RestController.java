package com.quiz.lesson07;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.entity.CompanyEntity;

@RequestMapping("/lesson07")
@RestController
public class Lesson07Quiz01RestController {
	
	// c: create
	@GetMapping("/quiz01/save1")
	public CompanyEntity create() {
		String name = "넥손";
		String business = "컨텐츠 게임";
		String scale = "대기업";
		int headcount = 3585;
		
		// 방금 인서트된 pk id도 바로 얻어낼 수 있다.
		
	}
	
	// c: create
		@GetMapping("/quiz01/save2")
		public CompanyEntity create() {
			String name = "버블팡";
			String business = "여신 금융업";
			String scale = "대기업";
			int headcount = 6834;
			
			// 방금 인서트된 pk id도 바로 얻어낼 수 있다.
			
		}
}
