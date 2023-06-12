package com.multi.quizwiki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.quizwiki.dao.QboardDAO;
import com.multi.quizwiki.dto.QboardDTO;

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
		int result = qboarddao.insert(qboard);
		return result;

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
