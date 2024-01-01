package com.quiz.weather_history;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.weather_history.bo.WeatherHistoryBO;
import com.quiz.weather_history.domain.WeatherHistory;

@RequestMapping("/weather-history")
@Controller
public class WeatherHistoryController {
	
	@Autowired
	private WeatherHistoryBO weatherHistoryBO;
	
	// 날씨 추가화면
	@GetMapping("/add-weather-view")
	public String addWeatherView() {
		return "weather_history/addWeather";
	}
	
	// 날씨 추가 수행 => 날씨 목록 화면으로 이동
	@PostMapping("/add-weather")
	public String addWeather(
			@RequestParam("date")@DateTimeFormat(pattern = "yyyy-MM-dd")Date date,
			@RequestParam("weather")String weather,
			@RequestParam("microDust")String microDust,
			@RequestParam("temperatures")double temperatures,
			@RequestParam("precipitation")double precipitation,
			@RequestParam("windSpeed")double windSpeed){
		
		//db insert
		weatherHistoryBO.addWeatherHistory(date, weather, microDust, temperatures, precipitation, windSpeed);
		
		// 결과 화면 => 리다이렉트 302
		return "redirect:/weather-history/weather-list-view";
	}
	
	// 날씨 목록 화면
	@GetMapping("/weather-list-view")
	public String weatherListView(Model model) {
		
		List<WeatherHistory> weatherHistoryList = weatherHistoryBO.getWeatherHistoryList();
		model.addAttribute("weatherHistoryList", weatherHistoryList);
		return "weather_history/weatherList";
	}
}
