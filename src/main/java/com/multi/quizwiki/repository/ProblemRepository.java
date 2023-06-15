package com.multi.quizwiki.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.entity.problem.ProblemEntity;

public interface ProblemRepository extends JpaRepository<ProblemEntity, String>{
	public List<ProblemEntity> findAllByPboardId(String pboardId);
}
