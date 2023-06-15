package com.multi.quizwiki.qboard.service;

import java.util.List;

import com.multi.quizwiki.qboard.dto.QboardDTO;
public interface QboardService {
	public int insert(QboardDTO qboard);


	 public List<QboardDTO> getBoardList(); 
	
	
	 public QboardDTO getQboardDetail(Long qboard_id);
	 		

}