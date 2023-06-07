package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("quizwiki")
public class QBoardController {


	@RequestMapping("/qboard/list")
	public String show_qboard_list() {
		return "thymeleaf/qboard/qboard_list";
	}
	
	@GetMapping("/qboard/write")
	public String show_qboard_write() {
		return "thymeleaf/qboard/qboard_write";
	}
	@GetMapping("/freeboard/list")
	public String show_freeboard_list() {
		return "thymeleaf/qboard/freeboard_list	";
	}
	
	@GetMapping("/qboard/read")
	public String show_qboard_read() {
		return "thymeleaf/qboard/qboard_read";
	}

}
