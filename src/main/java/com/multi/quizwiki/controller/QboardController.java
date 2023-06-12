package com.multi.quizwiki.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.multi.quizwiki.dto.QboardDTO;
import com.multi.quizwiki.service.QboardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Controller
@Slf4j
@RequestMapping("quizwiki")
@RequiredArgsConstructor
public class QboardController {
	QboardService qboardservice;

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
	
	@RequestMapping("/qboard/write.do")
	public String QboardWrite(@RequestParam(value="qboard_id",required=false) int qboard_id, Model model) {
		log.info("write.do실행" +qboard_id);
		 
			model.addAttribute("qboard", new QboardDTO());
		 
			 
		return "thymeleaf/qboard/qboard_list";
	}
	
	
	  @GetMapping("/qboard/list.do") public String QboardList(Model model) {
	  List<QboardDTO> qboardList = qboardservice.getBoardList();
	  model.addAttribute("qboardlist",qboardList); 
	  return "qboard/qboard_list"; }
	 	
	
	  }
