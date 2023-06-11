package com.multi.quizwiki.dao;

import com.multi.quizwiki.entity.PboardEntity;
import com.multi.quizwiki.entity.ProblemChoiseEntity;
import com.multi.quizwiki.entity.ProblemEntity;

public interface PboardDAO {
	public void pboard_insert(PboardEntity pboard);
	public void problem_insert(ProblemEntity problem);
	public void problemChoise_insert(ProblemChoiseEntity problemChoise);
}
