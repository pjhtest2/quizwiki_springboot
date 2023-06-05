package com.multi.quizwiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FaqController {
	@RequestMapping("/use")
	public String use() {
		return "use";
	}
	@RequestMapping("/infor")
	public String infor() {
		return "infor";
	}
	@RequestMapping("/faqt")
	public String faqt() {
		return "total1";
	}
	@RequestMapping("/total2")
	public String total2() {
		return "total2";
	}
	@RequestMapping("/total3")
	public String total3() {
		return "total3";
	}
	@RequestMapping("/usecredit")
	public String usecredit() {
		return "usecredit";
	}
	@RequestMapping("/contentquestion")
	public String contentquestion() {
		return "contentquestion";
	}
	@RequestMapping("/siteuse")
	public String siteuse() {
		return "siteuse";
	}
	@RequestMapping("/etc")
	public String etc() {
		return "etc";
	}
	@RequestMapping("/oto")
	public String oto() {
		return "oto";
	}
}
