package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson04.bo.RealtorBO;
import com.quiz.lesson04.domain.Realtor;

@RequestMapping("/lesson04/quiz02")
@Controller
public class Lesson04Quiz02Controller {
	
	@Autowired
	private RealtorBO realtorBO;
	
	// url : http://localhost/lesson04/quiz02/add-realtor-view
	// 공인중개사 추가
	@GetMapping("add-realtor-view")
	public String addRealtorView() {
		return "lesson04/addRealtor";
	}
	
	// 방금 추가된 데이터를 뿌려주는 화면 & DB insert
	// action : http://localhost/lesson04/quiz02/add-realtor
	@PostMapping("add-realtor")
	public String addRealtor(
			@ModelAttribute Realtor realtor,
			Model model) { // 태그의 name 속성파라미터와 이름이 같은 필드에 매핑
		
		// DB에서 방금 추가된 pk받아옴 => realtor에 세팅 (select)
		realtorBO.addRealtor(realtor);
		
		// realtor에 세팅된 id로 객체 다시 조회(방금 추가된) selectById
		Realtor latestRealtor = realtorBO.getRealtorById(realtor.getId());
		
		// Model 객체에 담는다. (jsp에서 사용하도록)
		model.addAttribute("result", latestRealtor);
		model.addAttribute("title", "공인중개사 정보");
		
		// 화면 뿌리기 => 테이블로 뿌리기 jsp화면으로 이동
		return "lesson04/afterAddRealtor";
	}
}
