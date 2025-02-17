package com.multi.quizwiki.qboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.maven.doxia.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.quizwiki.qboard.dao.CommentMapper;
import com.multi.quizwiki.qboard.dto.CommentRequest;
import com.multi.quizwiki.qboard.dto.CommentResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
@RequiredArgsConstructor
public class CommentService {
	@Autowired
	private CommentMapper commentmapper;
	
	
	@Transactional
	public Long saveComment(CommentRequest params) {
		log.info("댓글 서비스 실행");
		commentmapper.save(params);
		log.info("댓글 서비스"+params.getCommentId());
		return params.getCommentId();
	}
	
	 public CommentResponse findCommentById(final Long commentId) {
	        return commentmapper.findById(commentId);
	    }
	
	@Transactional
	    public Long updateComment(final CommentRequest params) {
	        commentmapper.update(params);
	        return params.getCommentId();
	    }

	    /**
	     * 댓글 삭제
	     * @param id - PK
	     * @return PK
	     */
	    @Transactional
	    public Long deleteComment(final Long commentId) {
	        commentmapper.deleteById(commentId);
	        return commentId;
	    }

	    /**
	     * 댓글 리스트 조회
	     * @param postId - 게시글 번호 (FK)
	     * @return 특정 게시글에 등록된 댓글 리스트
	     */
	    public List<CommentResponse> findAllComment(final Long qboardId) {
	        return commentmapper.findAll(qboardId);
	    }
}
