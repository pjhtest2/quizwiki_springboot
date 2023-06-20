package com.multi.quizwiki.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.entity.pboard.PboardReplyEntity;

public interface PboardReplyRepository extends JpaRepository<PboardReplyEntity, String>{
	public Page<PboardReplyEntity> findByPboardId(String pboardId, Pageable pageable);
}