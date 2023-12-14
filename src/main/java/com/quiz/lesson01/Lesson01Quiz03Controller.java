package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// jsp파일로 보낼 때는 Controller만 사용한다.
@Controller
public class Lesson01Quiz03Controller {
	
	//http://localhost:8080/lesson01/quiz03/1
	@RequestMapping("/lesson01/quiz03/1")
	public String quiz03() {
		//jsp 파일 경로: src/main/webapp/WEB-INF/jsp/lesson01/quiz03.jsp
		
		//@ResponseBody가 아닌 단독으로 사용되는 @Controller + return String
		//ViewResolver에 의해 리턴된 String의 jsp 경로를 찾고 화면이 구성된다 => HTML 응답(Response Body)
		return "lesson01/quiz03"; // view쪽으로 리턴
	}
}
