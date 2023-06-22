package com.multi.quizwiki.problem.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.problem.entity.ProblemLikeEntity;

public interface ProblemLikeRepository extends JpaRepository<ProblemLikeEntity, Integer>{
	public ProblemLikeEntity findByMemberIdAndProblemId(String memberId, int problemId);
}
