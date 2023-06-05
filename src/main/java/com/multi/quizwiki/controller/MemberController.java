package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MemberController {

	public MemberController() {
		
	}
	
	@RequestMapping("/login.do")
	public String show_login() {
		return "thymeleaf/member/login";
	}
	
	@RequestMapping("/signup.do")
	public String show_signup() {
		return "thymeleaf/member/signup";
	}
	
	@RequestMapping("/findId.do")
	public String show_id_forgot() {
		return "thymeleaf/member/login_id_forgot";
	}
	
	@RequestMapping("/findPass.do")
	public String show_pass_forgot() {
		return "thymeleaf/member/login_pass_forgot";
	}
	
	@RequestMapping("/findId")
	public String show_id() {
		return "thymeleaf/member/login_id_forgot_find";
	}
	
	@RequestMapping("/findPass")
	public String show_pass() {
		return "thymeleaf/member/login_pass_forgot_find";
	}
	
	@RequestMapping("/signupAgreement")
	public String show_signup_agreement() {
		return "thymeleaf/member/signup_agreement";
	}
	
}
