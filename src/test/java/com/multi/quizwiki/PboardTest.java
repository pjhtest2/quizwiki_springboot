package com.multi.quizwiki;

import java.util.List;

import javax.persistence.Transient;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.quizwiki.dto.PboardDTO;
import com.multi.quizwiki.pboard.dao.PboardDAO;
import com.multi.quizwiki.pboard.entity.PboardEntity;

@SpringBootTest
public class PboardTest {
	
	@Autowired
	PboardDAO dao;
	
	public void findOrderByLikeCount(){
		List<PboardDTO> result =  dao.pboard_findOrderByLikeCount(5);
		
		result.forEach((p)->{
			System.out.println(p);
		});
	}
	
	@Transactional
	@Test
	public void findTop10ByPboardStatusNotOrderByPboardShowCountDesc() {
		List<PboardEntity> result = dao.findTop10ByPboardStatusNotOrderByPboardShowCountDesc();

		result.forEach((e)->{
			System.out.println(e.getPboardShowCount() + "======================");
		});
	}
}
