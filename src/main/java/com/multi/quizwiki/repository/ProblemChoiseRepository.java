package com.multi.quizwiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.entity.problem.ProblemChoiseEntity;

public interface ProblemChoiseRepository extends JpaRepository<ProblemChoiseEntity, String>{
	public void deleteAllByProblemId(String problemId);
}
