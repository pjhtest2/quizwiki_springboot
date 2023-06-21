package com.multi.quizwiki.qboard.service;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.quizwiki.qboard.dao.QboardDAO;
import com.multi.quizwiki.qboard.dto.QboardDTO;
import com.multi.quizwiki.qboard.dto.QboardRequestDTO;
import com.multi.quizwiki.qboard.dto.SearchDto;
import com.multi.quizwiki.qboard.entity.QboardEntity;
import com.multi.quizwiki.qboard.entity.QboardReplyEntity;
import com.multi.quizwiki.qboard.paging.Pagination;
import com.multi.quizwiki.qboard.paging.PagingResponse;
import com.multi.quizwiki.qboard.repository.QboardRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class QboardServiceImpl implements QboardService {
	@Autowired
	QboardDAO qboarddao;
	
	private final QboardRepository qboardrepo;

	@Override
	public int insert(QboardDTO qboard) {
		log.info("insert service 실행" +qboard.getQboard_id());
		return qboarddao.insert(qboard);

	}

	@Override
	public PagingResponse<QboardDTO> getBoardList(SearchDto params) {
		
		int count = qboarddao.count(params);
		if (count<1) {
			return new PagingResponse<>(Collections.emptyList(), null);
		}
		
		Pagination pagination = new Pagination(count, params);
		params.setPagination(pagination);
		
		
		List<QboardDTO> list = qboarddao.getBoardList(params);
		return new PagingResponse<>(list, pagination);
	}

	@Override
	public QboardDTO getQboardDetail(Long qboard_id) {
		return qboarddao.getQboardDetail(qboard_id);

	}

	@Override
	public void reply_insert(QboardReplyEntity qboardReply) {
		qboarddao.reply_insert(qboardReply);
	}

	@Override
	public int update(QboardDTO qboard) {
		return qboarddao.update(qboard);
	}

	@Override
	public int deleteQboard(Long qboard_id) {
		log.info("서비스 실행");
		return qboarddao.deleteQboard(qboard_id);
	}

	@Override
	public int count(SearchDto params) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	/*
	 * public void save (QboardDTO qboard) { QboardEntity qboardEntitiy =
	 * QboardEntity.toSaveEntity(qboard); qboardRepo.save(qboardEntitiy); }
	 */
}
