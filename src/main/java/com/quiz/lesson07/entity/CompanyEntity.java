package com.quiz.lesson07.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString // 객체를 출력시 필드 값이 보여진다.
@AllArgsConstructor // 파라미터가 모두 있는 생성자
@NoArgsConstructor // 파라미터가 없는 생성자
@Builder // setter 대신에 사용 
@Getter
@Table(name = "company")
@Entity // 이 객체는 엔티티다. (JPA - DB)
public class CompanyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String business;
	
	private String scale;
	
	private int headcount;
	
	@UpdateTimestamp // createAt이 null이어도 현재 시간으로 저장
	@Column(name = "createdAt", updatable = false) // 업데이트시 변경되지않도록 설정
	private Date createdAt;
	
	@UpdateTimestamp // createAt이 null이어도 현재 시간으로 저장
	@Column(name = "updatedAt", updatable = false) // 업데이트시 변경되지않도록 설정
	private Date updatedAt;
}
