package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson04.bo.SellerBO;
import com.quiz.lesson04.domain.Seller;

@RequestMapping("/lesson04/quiz01")
@Controller
public class Lesson04Quiz01Controller {
	
	@Autowired
	private SellerBO sellerBO;
	
	//http://localhost/lesson04/quiz01/add-seller-view
	//판매자 추가화면
	@GetMapping("/add-seller-view")
	
	public String addSellerView() {
		return "lesson04/addSeller";
	}
	
	// DB insert => 입력 성공 화면
	@PostMapping("/add-seller")
	public String addSeller(
			@RequestParam("nickname") String nickname,
			@RequestParam(value = "profileImageUrl", required = false) String profileImageUrl, 
			@RequestParam("temperature") double temperature) {
		
		// DB insert
		sellerBO.addSeller(nickname, profileImageUrl, temperature);
		
		return "/lesson04/afterAddSeller";
	}
	
	// 최근에 추가된 seller의 정보
	// http://localhost/lesson04/quiz01/seller-info-view
	// http://localhost/lesson04/quiz01/seller-info-view?id=2
	@GetMapping("/seller-info-view")
	public String sellerInfoView(	//null일수도 있고 아닐수도 있다. 그래서 Integer
			@RequestParam(value = "id", required = false) Integer id,
			Model model) { // Model: view 화면에 데이터를 넘겨주는 객체
		// DB select(최신 가입자)
		Seller seller = null;
		if (id == null) {
			seller = sellerBO.getLatestSeller();
		} else {
			seller = sellerBO.getSellerById(id);
		}
	
		
		// Model 주머니에 데이터를 담는다. => jsp에서 꺼내 쓴다.
		model.addAttribute("result", seller);
		model.addAttribute("title", "판매자 정보");
		
		// 응답 화면
		return "lesson04/sellerInfo"; // 결과화면 jsp
	}
	
}
