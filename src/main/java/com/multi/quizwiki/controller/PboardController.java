package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PboardController {
	
	public PboardController() {
		
	}
	

	@RequestMapping("/pboard/list")
	public String show_pboard_list() {
		return "thymeleaf/pboard/pboard_list";
	}
	
	@GetMapping("/pboard/write")
	public String show_pboard_write() {
		return "thymeleaf/pboard/pboard_write";
	}
	
	@GetMapping("/pboard/read")
	public String show_pboard_read() {
		return "thymeleaf/pboard/pboard_read";
	}
	
	@GetMapping("/cbt")
	public String show_cbt() {
		return "thymeleaf/pboard/cbt";
	}
}
