package com.multi.quizwiki.pboard.service;

import java.io.IOException;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.multi.quizwiki.pboard.entity.PboardCateEntity;
import com.multi.quizwiki.pboard.entity.PboardEntity;
import com.multi.quizwiki.pboard.entity.PboardReplyEntity;
import com.multi.quizwiki.pboard.entity.PrintFileEntity;
import com.multi.quizwiki.pboard.entity.ProblemCateEntity;
import com.multi.quizwiki.pboard.entity.ProblemEntity;

public interface PboardService {
	
	public void pboard_insert(
			PboardEntity pboard,
			List<ProblemEntity> problemList,
			List<List<String>> problemChoiseList,
			List<MultipartFile> printfileList,
			List<Integer> printfileArr);
	
	public void reply_insert(PboardReplyEntity pboardReply);
	
	public void pboard_edit(
			PboardEntity pboard,
			List<ProblemEntity> problemList,
			List<List<String>> problemChoiseList,
			List<MultipartFile> printfileList,
			List<Integer> printfileArr);
	

	public Page<PboardEntity> pboard_findByCate(int pboardCateId , Pageable pageable);
	public PboardEntity pboard_findById(String pboardId);
	
	public PrintFileEntity printfile_findByProblemId(String problemId);
	
	public List<PboardCateEntity> pboardCate_findAll();
	public List<ProblemEntity> problem_findByPboardId(String pboardId);
	public List<ProblemCateEntity> problemCate_findAll();
	
	
}
