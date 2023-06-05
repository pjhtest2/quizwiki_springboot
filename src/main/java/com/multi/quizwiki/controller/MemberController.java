package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MemberController {

	public MemberController() {
		
	}
	
	@RequestMapping("/login.do")
	public String show_login() {
		return "/login";
	}
	
	@RequestMapping("/signup.do")
	public String show_signup() {
		return "/signup";
	}
	
	@RequestMapping("/findId.do")
	public String show_id_forgot() {
		return "/find_id";
	}
	
	@RequestMapping("/findPass.do")
	public String show_pass_forgot() {
		return "/find_pass";
	}
	
	@RequestMapping("/findId")
	public String show_id() {
		return "/find_forgot_id";
	}
	
	@RequestMapping("/findPass")
	public String show_pass() {
		return "/find_forgot_pass";
	}
	
	@RequestMapping("/signupAgreement")
	public String show_signup_agreement() {
		return "thymeleaf/member/signup_agreement";
	}
	
}
