package com.quiz.lesson05.bo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson02.domain.Store;

@Service
public class WeatherBO {
	
	public String quiz01() {
		return storeBO.getUsedGoodsList(); 
	}
}
