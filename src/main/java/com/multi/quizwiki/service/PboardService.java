package com.multi.quizwiki.service;

import com.multi.quizwiki.entity.PboardEntity;
import com.multi.quizwiki.entity.ProblemChoiseEntity;
import com.multi.quizwiki.entity.ProblemEntity;

public interface PboardService {
	public void insert(PboardEntity pboard,ProblemEntity problem, ProblemChoiseEntity problemChoise);
}
