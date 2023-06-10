package com.multi.quizwiki.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.multi.quizwiki.dto.QboardDTO;

import lombok.RequiredArgsConstructor;
@Repository
@RequiredArgsConstructor
public class QboardDAOImpl implements QboardDAO {
	
	SqlSession template;
	

	

	@Override
	public int insert(QboardDTO qboard) {
		int result =  template.insert("com.multi.quizwiki.qboard.insert", qboard);
		return result;
	}

	/*
	 * @Override public List<QboardDTO> getBoardList() { return
	 * template.selectList("com.multi.quizwiki.qboard.selectAll"); }
	 */

	/*
	 * @Override public QboardDTO getQboardDetail(int qboard_id) { return
	 * template.selectOne("com.multi.quizwiki.qboard.selectBoardDetail",qboard_id);
	 * }
	 */
}
