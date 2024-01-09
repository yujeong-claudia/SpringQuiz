package com.quiz.lesson07.entity;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString // 객체를 출력시 필드 값이 보여진다.
@AllArgsConstructor // 파라미터가 모두 있는 생성자
@NoArgsConstructor // 파라미터가 없는 생성자
@Builder(toBuilder = true) // setter 대신에 사용, 객체 필드 수정 가능
@Getter
@Table(name = "recruit")
@Entity
public class RecruitEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "companyId")
	private int companyId;
	
	private String position;
	
	private String responsibilities;
	
	private String qualification;
	
	private String type;
	
	private String region;
	
	private int salary;
	
	private LocalDate deadline; //시분초 없음, 타임존 정보없음(그냥 그 날짜)
	
	@UpdateTimestamp // createAt이 null이어도 현재 시간으로 저장
	@Column(name = "createdAt", updatable = false)
	private ZonedDateTime createdAt;
	
	@UpdateTimestamp // updatedAt이 null이어도 현재 시간으로 저장
	@Column(name = "updatedAt")
	private ZonedDateTime updatedAt;
}
