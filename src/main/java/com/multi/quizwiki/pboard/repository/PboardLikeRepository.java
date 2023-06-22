package com.multi.quizwiki.pboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.pboard.entity.PboardLikeEntity;

public interface PboardLikeRepository extends JpaRepository<PboardLikeEntity, Integer>{
	public PboardLikeEntity findByMemberIdAndPboardId(String memberId, int pboardId);
}
