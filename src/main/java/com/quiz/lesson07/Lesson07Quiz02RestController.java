package com.quiz.lesson07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.entity.RecruitEntity;
import com.quiz.lesson07.repository.RecruitRepository;

@RequestMapping("/lesson07/quiz02")
@RestController
public class Lesson07Quiz02RestController {
	
	/// !!!이번에만 BO 생략
	@Autowired
	private RecruitRepository recruitRepository;
	
	@GetMapping("/1")
	public List<RecruitEntity> getRecruitList() {
		return recruitRepository.findTopById(8);
	}
	
	@GetMapping("/2")
	public List<RecruitEntity> getRecruitList2() {
		return recruitRepository.findBycompanyId(1);
	}
	
	@GetMapping("/3")
	public List<RecruitEntity> getRecruitList3() {
		return recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
	}
	
//	@GetMapping("/4")
//	public List<RecruitEntity> getRecruitList4() {
//		return recruitRepository.findByPositionOrType("웹 back-end 개발자", "정규직");
//	}
	
//	@GetMapping("/5")
//	public List<RecruitEntity> getRecruitList5() {
//		return recruitRepository.findTop3ByOrderBySalaryDesc("계약직");
//	}
	
	@GetMapping("/6")
	public List<RecruitEntity> getRecruitList6() {
		return recruitRepository.findBySalaryBetween(7000, 8500);
	}
}