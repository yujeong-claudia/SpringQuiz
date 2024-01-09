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
		// 방금 인서트된 pk id도 바로 얻어낼 수 있다.
		return companyBO.addCompany("넥손", "컨텐츠 게임", "대기업", 3585);
	}
	
	// c: create
		@GetMapping("/save2")
		public CompanyEntity save2() {
			// 방금 인서트된 pk id도 바로 얻어낼 수 있다.
			return companyBO.addCompany("버블팡", "여신 금융업", "대기업", 6834);
		}
		
		// u: update
		@GetMapping("/update")
		public CompanyEntity update() {
			// id가 8번 scale=중소기업 headcount=34
			
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
