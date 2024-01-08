package com.quiz.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.bo.CompanyBO;
import com.quiz.lesson07.entity.CompanyEntity;

@RequestMapping("/lesson07/quiz01")
@RestController
public class Lesson07Quiz01RestController {
	
	@Autowired
	private CompanyBO companyBO;
	
	// /lesson07/quiz01/save1
	// c: create
	@GetMapping("/save1")
	public CompanyEntity save1() {
//		String name = "넥손";
//		String business = "컨텐츠 게임";
//		String scale = "대기업";
//		int headcount = 3585;
		
		// 방금 인서트된 pk id도 바로 얻어낼 수 있다.
		return companyBO.addCompany("넥손", "컨텐츠 게임", "대기업", 3585);
	}
	
	// c: create
		@GetMapping("/save2")
		public CompanyEntity save2() {
//			String name = "버블팡";
//			String business = "여신 금융업";
//			String scale = "대기업";
//			int headcount = 6834;
			
			// 방금 인서트된 pk id도 바로 얻어낼 수 있다.
			return companyBO.addCompany("버블팡", "여신 금융업", "대기업", 6834);
		}
		
		// u: update
		@GetMapping("/update")
		// id가 8번 scale=중소기업 headcount=34
		public CompanyEntity udtate() {
			// id가 3번인 dreamJob 변경
			// 5, 디자이너
			
			return companyBO.updateCompanyScaleHeadcountById(8, "중소기업", 34);
		}
		
		// d: delete
		@GetMapping("/delete")
		public String delete() {
			//id:8
			companyBO.deleteCompanyById(8);
			return "수행 완료";
		}
		
}
