package com.multi.quizwiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.entity.problem.PrintFileEntity;

public interface PrintFileRepository extends JpaRepository<PrintFileEntity, String>{
	public PrintFileEntity findByProblemId(String problemId);
	public void deleteAllByProblemId(String problemId);
}
