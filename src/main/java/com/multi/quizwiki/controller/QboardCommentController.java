package com.multi.quizwiki.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multi.quizwiki.qboard.dto.CommentRequest;
import com.multi.quizwiki.qboard.dto.CommentResponse;
import com.multi.quizwiki.qboard.service.CommentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequiredArgsConstructor
public class QboardCommentController {
	private CommentService commentservice;
	//댓글 생성
	@PostMapping("/qboard/{qboardId}/comments")
	public CommentResponse saveCommnet(@PathVariable Long qboardId, @RequestBody 
			CommentRequest params) {
			log.info("댓글 생성 컨트롤러 실행");
			Long commentId =commentservice.saveComment(params);
			return commentservice.findCommentById(commentId);
			}
	//댓글 리스트 조회
	@GetMapping("/qboard/{qboardId}/comments")
	public List<CommentResponse> findAllComment(@PathVariable Long qboardId) {
		return commentservice.findAllComment(qboardId);
	}
	
	@PatchMapping("qboard/{qboardId}/comments")
	public CommentResponse updatecomment(@PathVariable Long qboardId,@PathVariable Long commentId,
			@RequestBody CommentRequest params ) {
		commentservice.updateComment(params);
		return commentservice.findCommentById(commentId);
	}
	
	@DeleteMapping("qboard/{qboardId}/comments")
	public Long deletecomment(@PathVariable Long qboardId, @PathVariable Long commentId) {
		return commentservice.deleteComment(commentId);
	}
}
