package com.multi.quizwiki.qboard.dao;

import java.util.List;

import com.multi.quizwiki.qboard.dto.QboardDTO;
public interface QboardDAO {
	public int insert(QboardDTO qboard);
	
	
	 public List<QboardDTO> getBoardList();
	 
	
	 public QboardDTO getQboardDetail(Long qboard_id);
	 
}
