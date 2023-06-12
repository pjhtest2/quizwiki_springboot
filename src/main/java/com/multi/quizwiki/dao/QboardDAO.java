package com.multi.quizwiki.dao;

import java.util.List;

import com.multi.quizwiki.dto.QboardDTO;
public interface QboardDAO {
	public int insert(QboardDTO qboard);
	
	
	 public List<QboardDTO> getBoardList();
	 
	
	 public QboardDTO getQboardDetail(int qboard_id);
	 
}
