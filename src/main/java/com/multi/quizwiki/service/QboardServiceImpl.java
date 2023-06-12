package com.multi.quizwiki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.quizwiki.dao.QboardDAO;
import com.multi.quizwiki.dto.QboardDTO;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class QboardServiceImpl implements QboardService {

	QboardDAO qboarddao;

	@Autowired
	public QboardServiceImpl(QboardDAO qboarddao) {
		super();
		this.qboarddao = qboarddao;
	}

	@Override
	public int insert(QboardDTO qboard) {
		log.info("insert service 실행" +qboard.getQboard_id());
		return qboarddao.insert(qboard);

	}

	@Override
	public List<QboardDTO> getBoardList() {
		return qboarddao.getBoardList();
	}

	@Override
	public QboardDTO getQboardDetail(int qboard_id) {
		return qboarddao.getQboardDetail(qboard_id);

	}

}
