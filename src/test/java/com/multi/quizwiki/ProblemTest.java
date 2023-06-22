package com.multi.quizwiki;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.quizwiki.dto.ProblemDTO;
import com.multi.quizwiki.problem.dao.ProblemDAO;

@SpringBootTest
public class ProblemTest {
	
	@Autowired
	ProblemDAO dao;
	
	public void findByMemberId() {
		int page = 1;
		int size = 5;
		
		List<ProblemDTO> result = dao.problem_findLikedByMemberId("test", size, page);
		
		
		System.out.println(result.size());
		result.forEach((e)->{
			System.out.println(e);
		});
	}
	
	@Test
	public void findOrderByInquiry() {
		List<ProblemDTO> result = dao.problem_findOrderByInquiry(5);
		result.forEach((e)->{
			System.out.println(e);
		});
	}
}
