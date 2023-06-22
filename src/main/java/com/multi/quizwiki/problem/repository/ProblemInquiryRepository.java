package com.multi.quizwiki.problem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.problem.entity.ProblemInquiryEntity;

public interface ProblemInquiryRepository extends JpaRepository<ProblemInquiryEntity, Integer>{
	
}
