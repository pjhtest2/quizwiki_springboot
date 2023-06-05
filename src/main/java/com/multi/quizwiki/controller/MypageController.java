package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MypageController {
	@RequestMapping("/mypage/mycontentroom")
	public String mycontentroom() {
		return "mypage/mycontentroom";
	}
	@RequestMapping("/mypage/ask")
	public String ask() {
		return "mypage/ask";
	}
	@RequestMapping("/mypage/cash")
	public String cash() {
		return "mypage/cash";
	}
	@RequestMapping("/mypage/modify")
	public String modify() {
		return "mypage/modify";
	}
	@RequestMapping("/mypage/myquestion")
	public String myquestion() {
		return "mypage/myquestion";
	}
	@RequestMapping("/mypage/payment")
	public String payment() {
		return "mypage/payment";
	}
	@RequestMapping("/mypage/point")
	public String point() {
		return "mypage/point";
	}
	@RequestMapping("/mypage/suggest")
	public String suggest() {
		return "mypage/suggest";
	}
}
