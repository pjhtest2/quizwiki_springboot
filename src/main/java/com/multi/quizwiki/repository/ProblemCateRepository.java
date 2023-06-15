package com.multi.quizwiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.entity.problem.ProblemCateEntity;

public interface ProblemCateRepository extends JpaRepository<ProblemCateEntity, String>{

}
