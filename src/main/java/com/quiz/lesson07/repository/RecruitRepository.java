package com.quiz.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.lesson07.entity.RecruitEntity;

public interface RecruitRepository extends JpaRepository<RecruitEntity, Integer> {

	//1
	public List<RecruitEntity> findTopById(int id);
	//2
	public List<RecruitEntity> findBycompanyId(int companyId);
	//3
	public List<RecruitEntity> findByPositionAndType(String position, String type);
	//4
	//public List<RecruitEntity> findByPositionAndType(String position, String type);
	//5
	public List<RecruitEntity> findTop3ByOrderBySalaryDesc(String type);
	//6
	public List<RecruitEntity> findBySalaryBetween(int startSalary, int endSalary);
	
	
}

