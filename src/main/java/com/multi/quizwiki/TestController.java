package com.multi.quizwiki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("freeboard/list")
	public String go_freeboard() {
		return "qboard/freeboard_list";
	}
}
