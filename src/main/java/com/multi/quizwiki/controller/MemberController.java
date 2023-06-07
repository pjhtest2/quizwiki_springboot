package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	public MemberController() {

	}

	// 로그인
	@RequestMapping("/login.do")
	public String show_login() {
		return "thymeleaf/member/login";
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

	// 청소년 : 1, 대학생 : 2 - 회원 타입 구분
	@RequestMapping("/signupType")
	public String show_signup_type() {
		return "thymeleaf/member/signup_student_type";
	}

	// 청소년용 약관 동의서
	@RequestMapping("/signupAgreement1")
	public String show_signup_agreement1() {
		return "thymeleaf/member/signup_agreement1";
	}

	// 대학생용 약관 동의서
	@RequestMapping("/signupAgreement2")
	public String show_signup_agreement2() {
		return "thymeleaf/member/signup_agreement2";
	}

	// 회원가입 양식 작성 - 청소년
	@RequestMapping("/signup1")
	public String show_signup1() {
		return "thymeleaf/member/signup1";
	}

	// 회원가입 양식 작성 - 대학생
	@RequestMapping("/signup2")
	public String show_signup2() {
		return "thymeleaf/member/signup2";
	}
}
