package com.quiz.lesson07.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson07.entity.CompanyEntity;
import com.quiz.lesson07.repository.CompanyRespository;

@Service
public class CompanyBO {
	
	@Autowired
	private CompanyRespository companyRespository;
	
	public CompanyEntity addCompany(String name, String business,
			String scale, int headcount) {
		
		CompanyEntity company = CompanyEntity.builder()
				.name(name)
				.business(business)
				.scale(scale)
				.headcount(headcount)
				.build(); //new를 하는 동시에 세팅도 해준다.
		
		return companyRespository.save(company);
	}
}
