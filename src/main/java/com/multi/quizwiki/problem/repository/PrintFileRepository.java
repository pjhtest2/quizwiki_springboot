package com.multi.quizwiki.problem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.problem.entity.PrintFileEntity;

public interface PrintFileRepository extends JpaRepository<PrintFileEntity, Integer>{
	public PrintFileEntity findByProblemId(int problemId);
	public void deleteAllByProblemId(int problemId);
}
