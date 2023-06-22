package com.multi.quizwiki.problem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.problem.entity.ProblemCateEntity;

public interface ProblemCateRepository extends JpaRepository<ProblemCateEntity, Integer>{
	
}
