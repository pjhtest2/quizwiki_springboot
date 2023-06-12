package com.multi.quizwiki;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.quizwiki.dto.QboardDTO;
import com.multi.quizwiki.service.QboardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@RequestMapping("quizwiki")
@SpringBootTest
@RequiredArgsConstructor
@Slf4j
public class QboardControllerTest {
	@Autowired
	QboardService qboardservice;
	@Autowired
	QboardDTO  dto;
	@Test
	public void test() {
		log.info("hu");
	}
	
	@Test
	public void QboardWrtie() {
		QboardDTO dto = new QboardDTO();
		dto.setContent("content");
		dto.setTitle("title");
		dto.setQboard_id(1);
	}
	
	void testdb() {
		
	}
}
