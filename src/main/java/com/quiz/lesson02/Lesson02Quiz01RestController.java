package com.quiz.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson02.bo.StoreBO;
import com.quiz.lesson02.domain.Store;

@RestController //@Controller + ResponseBody
public class Lesson02Quiz01RestController {
	
	@Autowired // DI: 스프링 빈 주입
	private StoreBO storeBO;
	
	// url: http://localhost/lesson02/quiz01
	@RequestMapping("/lesson02/quiz01") //request
	public List<Store> quiz01() {
		return storeBO.getUsedGoodsList(); // response => JSON
	}
}
