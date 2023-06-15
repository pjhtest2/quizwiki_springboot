package com.multi.quizwiki.dao;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.multi.quizwiki.common.FileUploadLogicService;
import com.multi.quizwiki.entity.problem.PrintFileEntity;
import com.multi.quizwiki.entity.problem.ProblemCateEntity;
import com.multi.quizwiki.entity.problem.ProblemChoiseEntity;
import com.multi.quizwiki.entity.problem.ProblemEntity;
import com.multi.quizwiki.repository.PrintFileRepository;
import com.multi.quizwiki.repository.ProblemCateRepository;
import com.multi.quizwiki.repository.ProblemChoiseRepository;
import com.multi.quizwiki.repository.ProblemRepository;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Repository
public class ProblemDAOImpl implements ProblemDAO {

	ProblemRepository problemRepo;
	ProblemCateRepository problemCateRepo;
	ProblemChoiseRepository problemChoiseRepo;
	PrintFileRepository printFileRepo;
	FileUploadLogicService fileUpload;
	
	@Autowired
	public ProblemDAOImpl(
			ProblemRepository problemRepo, 
			ProblemChoiseRepository problemChoiseRepo, 
			ProblemCateRepository problemCateRepo,
			PrintFileRepository printFileRepo,
			FileUploadLogicService fileUpload) {
		this.problemRepo = problemRepo;
		this.problemChoiseRepo = problemChoiseRepo;
		this.problemCateRepo = problemCateRepo;
		this.printFileRepo = printFileRepo;
		this.fileUpload = fileUpload;
	}
	
	@Override
	public ProblemEntity insert(ProblemEntity problem) {
		return problemRepo.save(problem);
	}

	@Override
	public List<ProblemCateEntity> problemCate_findAll() {
		return problemCateRepo.findAll();
	}

	@Override
	public void printfile_insert(MultipartFile file, String problemId) throws IllegalStateException, IOException {
		String store = fileUpload.uploadFile(file);
		PrintFileEntity pf = new PrintFileEntity(problemId, file.getOriginalFilename(), store);
		printFileRepo.save(pf);
	}

	@Override
	public ProblemChoiseEntity problemChoise_insert(ProblemChoiseEntity problemChoise) {
		return problemChoiseRepo.save(problemChoise);
	}

	@Override
	public List<ProblemEntity> probleme_findByPboardId(String pboardId) {
		return problemRepo.findAllByPboardId(pboardId);
	}

	@Override
	public PrintFileEntity printfile_findByPboardId(String problemId) {
		return printFileRepo.findByProblemId(problemId);
	}

	@Override
	public void problem_delete(String problemId) {
		printFileRepo.deleteAllByProblemId(problemId);
		problemChoiseRepo.deleteAllByProblemId(problemId);
		problemRepo.deleteById(problemId);
	}

	@Override
	public List<ProblemEntity> problem_findAllByPboardId(String pboardId) {
		return problemRepo.findAllByPboardId(pboardId);
	}


}
