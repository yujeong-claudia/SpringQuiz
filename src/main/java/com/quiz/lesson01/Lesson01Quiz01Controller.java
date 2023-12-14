package com.quiz.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/quiz01")
@Controller // Spring bean으로 등록
public class Lesson01Quiz01Controller {
	
	// url: http://localhost:8080/lesson01/quiz01/1
	@RequestMapping("/1") // 주소 path 매핑
	@ResponseBody
	public String quiz01_1() {
		return "<h2>테스트 프로젝트 완성</h2><h3>해당 프로젝트를 통해서 문제 풀이를 진행합니다.</h3>";
	}
	
	// url: http://localhost:8080/lesson01/quiz01/2
	@RequestMapping("/2") // 주소 path 매핑
	@ResponseBody
	public Map<String, Object> quiz01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 85);
		
		return map;
	}
}
