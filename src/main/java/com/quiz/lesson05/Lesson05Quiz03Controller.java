package com.quiz.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Quiz03Controller {

	// url: http://localhost/lesson05/quiz03/1
	@GetMapping("/quiz03")
	public String quiz03_1(Model model) {
		List<Integer> candidates = new ArrayList<>();
		candidates.add(263001);
		candidates.add(173942);
		candidates.add(563057);

		model.addAttribute("candidates", candidates);

		return "lesson05/quiz03";
	}

	// url: http://localhost/lesson05/quiz03/2

	public String quiz03_2(Model model) {
	List<Map<String, Object>> cardBills = new ArrayList<>();

	Map<String, Object> cardBill = new HashMap<>();
	cardBill.put("store", "GS48");
	cardBill.put("pay", 7800);
	cardBill.put("date", "2025-09-14");
	cardBill.put("installment", "일시불");
	cardBills.add(cardBill);

	cardBill = new HashMap<>();
	cardBill.put("store", "현태백화점");
	cardBill.put("pay", 2750000);
	cardBill.put("date", "2025-09-18");
	cardBill.put("installment", "3개월");
	cardBills.add(cardBill);

	cardBill = new HashMap<>();
	cardBill.put("store", "요촌치킨");
	cardBill.put("pay", 180000);
	cardBill.put("date", "2025-09-20");
	cardBill.put("installment", "일시불");
	cardBills.add(cardBill);
	
	model.addAttribute("cardBill", cardBill);
	return "lesson05/quiz03-2";
	}
}
