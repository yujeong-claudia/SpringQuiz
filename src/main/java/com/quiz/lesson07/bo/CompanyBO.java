package com.quiz.lesson07.bo;

import java.util.Optional;

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
		
		return companyRespository.save(CompanyEntity.builder()
										.name(name)
										.business(business)
										.scale(scale)
										.headcount(headcount)
										.build()); // new가 되면서 세팅까지 완료된다.
	}
	
	// JPA로 업데이트
	public CompanyEntity updateCompanyScaleHeadcountById(int id, String scale, int headcount) {
		//selete
		CompanyEntity company = companyRespository.findById(id).orElse(null);
		if (company != null) {
			company = company.toBuilder()
					.scale(scale)
					.headcount(headcount)
					.build();
		}
		//update 
		company = companyRespository.save(company);
		return company;
	}
	
	public void deleteCompanyById(int id) {
		Optional<CompanyEntity> companyOptional = companyRespository.findById(id);
		companyOptional.ifPresent(c -> companyRespository.delete(c));
	}
}
