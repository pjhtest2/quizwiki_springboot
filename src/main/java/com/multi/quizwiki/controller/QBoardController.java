package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("quizwiki")
public class QBoardController {


	@RequestMapping("/qboard/list")
	public String show_qboard_list() {
		return "qboard/list";
	}
	
	@GetMapping("/qboard/write")
	public String show_qboard_write() {
		return "qboard/write";
	}
	@GetMapping("/freeboard/list")
	public String show_freeboard_list() {
		return "freeboard/list	";
	}
	
	@GetMapping("/qboard/read")
	public String show_qboard_read() {
		System.out.println("리퀘스트 실험");
		return "qboard/read";
	}

}
