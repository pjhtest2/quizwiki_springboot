package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {
	
	public MainPageController() {
		
	}
	//테스트로 주석
	
	@RequestMapping("/main")
	public String show_main() {
		return "singleTemplate";
	}
}
