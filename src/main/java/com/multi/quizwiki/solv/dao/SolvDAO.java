package com.multi.quizwiki.solv.dao;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import com.multi.quizwiki.dto.SolvDTO;

public interface SolvDAO {
	
	public int findCountByFilter(String memberId, Integer problemCateId, 
			Boolean solvRight, Date minDate, Date maxDate);
	
	public List<SolvDTO> findByFilter(String memberId, Integer problemCateId, 
			Boolean solvRight, Date minDate, Date maxDate,int size, int page);
	
}
