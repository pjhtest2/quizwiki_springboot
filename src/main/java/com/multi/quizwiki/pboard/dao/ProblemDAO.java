package com.multi.quizwiki.pboard.dao;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.multi.quizwiki.pboard.entity.PrintFileEntity;
import com.multi.quizwiki.pboard.entity.ProblemCateEntity;
import com.multi.quizwiki.pboard.entity.ProblemChoiseEntity;
import com.multi.quizwiki.pboard.entity.ProblemEntity;

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
