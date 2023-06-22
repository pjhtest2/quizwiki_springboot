package com.multi.quizwiki.problem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.problem.entity.ProblemChoiseEntity;

public interface ProblemChoiseRepository extends JpaRepository<ProblemChoiseEntity, Integer>{
	public void deleteAllByProblemId(int problemId);
}
