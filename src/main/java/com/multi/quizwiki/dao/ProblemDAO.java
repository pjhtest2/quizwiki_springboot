package com.multi.quizwiki.dao;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.multi.quizwiki.entity.problem.PrintFileEntity;
import com.multi.quizwiki.entity.problem.ProblemCateEntity;
import com.multi.quizwiki.entity.problem.ProblemChoiseEntity;
import com.multi.quizwiki.entity.problem.ProblemEntity;

public interface ProblemDAO {
	public ProblemEntity insert(ProblemEntity problem);
	public ProblemChoiseEntity problemChoise_insert(ProblemChoiseEntity problemChoise);
	public void printfile_insert(MultipartFile file, String problemId) throws IllegalStateException, IOException;
	
	public PrintFileEntity printfile_findByPboardId(String problemId);
	public List<ProblemCateEntity> problemCate_findAll();
	
	public List<ProblemEntity> probleme_findByPboardId(String pboardId);
	
	public void problem_delete(String problemId);
	public List<ProblemEntity> problem_findAllByPboardId(String pboardId);
}
