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
	
	// url : http://localhost/lesson04/quiz02/add_realtor_view
	// 공인중개사 추가
	@GetMapping("add_realtor_view")
	public String addRealtorView() {
		return "/lesson04/addRealtor";
	}
	
	// 방금 가입된 학생 화면 & DB insert
	// action : http://localhost/lesson04/quiz02/add_realtor
	@PostMapping("add_realtor")
	public String addRealtor(
			@ModelAttribute Realtor realtor,
			Model model) { // 태그의 name 속성파라미터와 이름이 같은 필드에 매핑
		
		// DB에 insert
		realtorBO.addRealtor(realtor);
		
		// DB에서 방금 가입된 사용자 select
		int id = realtor.getId();
		
		// selectById
		realtor = realtorBO.getLatestRealtor();
		
		// Model 객체에 담는다. (jsp에서 사용하도록)
		model.addAttribute("result", realtor);
		model.addAttribute("title", "공인중개사 정보");
		
		// 화면 뿌리기 => 테이블로 뿌리기
		return "/lesson04/afterAddRealtor";
	}
}
