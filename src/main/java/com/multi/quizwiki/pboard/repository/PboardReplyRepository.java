package com.multi.quizwiki.pboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.pboard.entity.PboardReplyEntity;

public interface PboardReplyRepository extends JpaRepository<PboardReplyEntity, String>{
	public Page<PboardReplyEntity> findByPboardId(String pboardId, Pageable pageable);
}
