package com.quiz.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05/quiz02")
@Controller
public class Lesson05Quiz02Controller {
	
	// url: http://localhost/lesson05/quiz02/1
	@RequestMapping("/1")
	public String quiz02_1(Model model) {
		
		List<String> musicRanking = new ArrayList<>();
		musicRanking.add("강남스타일");
		musicRanking.add("벚꽃엔딩");
		musicRanking.add("좋은날");
		musicRanking.add("거짓말");
		musicRanking.add("보고싶다");
		
		model.addAttribute("musicRanking", musicRanking);
		
		return "lesson05/quiz02-1";
	}
	
	// url: http://localhost/lesson05/quiz02/2
		@RequestMapping("/2")
		public String quiz02_2(Model model) {
			
			List<Map<String, Object>> membership = new ArrayList<>();

			Map<String, Object> member = new HashMap<>();
			member.put("name", "손오공");
			member.put("phoneNumber", "010-1234-5678");
			member.put("grade", "VIP");
			member.put("point", 12040);
			membership.add(member);

			member = new HashMap<>();
			member.put("name", "저팔계");
			member.put("phoneNumber", "010-4321-1234");
			member.put("grade", "BASIC");
			member.put("point", 3420);
			membership.add(member);

			member = new HashMap<>();
			member.put("name", "사오정");
			member.put("phoneNumber", "010-8888-1111");
			member.put("grade", "GOLD");
			member.put("point", 1530);
			membership.add(member);

			member = new HashMap<>();
			member.put("name", "삼장");
			member.put("phoneNumber", "010-0000-1234");
			member.put("grade", "GOLD");
			member.put("point", 8450);
			membership.add(member);

			member = new HashMap<>();
			member.put("name", "우마왕");
			member.put("phoneNumber", "010-1111-2222");
			member.put("grade", "BASIC");
			member.put("point", 420);
			membership.add(member);
			
			model.addAttribute("membership", membership);
			
			return "lesson05/quiz02-2";
		}
	
}
