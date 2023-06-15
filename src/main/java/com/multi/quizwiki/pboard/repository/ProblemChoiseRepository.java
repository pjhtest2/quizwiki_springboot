package com.multi.quizwiki.pboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.pboard.entity.ProblemChoiseEntity;

public interface ProblemChoiseRepository extends JpaRepository<ProblemChoiseEntity, String>{
	public void deleteAllByProblemId(String problemId);
}
