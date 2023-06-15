package com.multi.quizwiki.pboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.pboard.entity.PrintFileEntity;

public interface PrintFileRepository extends JpaRepository<PrintFileEntity, String>{
	public PrintFileEntity findByProblemId(String problemId);
	public void deleteAllByProblemId(String problemId);
}
