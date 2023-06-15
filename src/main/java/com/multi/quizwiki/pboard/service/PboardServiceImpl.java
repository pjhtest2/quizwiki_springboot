package com.multi.quizwiki.pboard.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.multi.quizwiki.common.FileUploadLogicService;
import com.multi.quizwiki.pboard.dao.PboardDAO;
import com.multi.quizwiki.pboard.dao.ProblemDAO;
import com.multi.quizwiki.pboard.entity.PboardCateEntity;
import com.multi.quizwiki.pboard.entity.PboardEntity;
import com.multi.quizwiki.pboard.entity.PboardReplyEntity;
import com.multi.quizwiki.pboard.entity.PrintFileEntity;
import com.multi.quizwiki.pboard.entity.ProblemCateEntity;
import com.multi.quizwiki.pboard.entity.ProblemChoiseEntity;
import com.multi.quizwiki.pboard.entity.ProblemEntity;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@Transactional
public class PboardServiceImpl implements PboardService {

	PboardDAO pboardDAO;
	ProblemDAO problemDAO;

	@Autowired
	public PboardServiceImpl(PboardDAO pboardDAO, ProblemDAO problemDAO) {
		this.pboardDAO = pboardDAO;
		this.problemDAO = problemDAO;
	}

	@Override
	public void pboard_edit(PboardEntity pboard, List<ProblemEntity> problemList, List<List<String>> problemChoiseList,
			List<MultipartFile> printfileList, List<Integer> printfileArr) {
		pboardDAO.pboard_edit(pboard);
		problemList.forEach((p) -> {
			p.setPboardId(pboard.getPboardId());
		});

		List<ProblemEntity> plist = problemDAO.problem_findAllByPboardId(pboard.getPboardId());
		plist.forEach((p) -> {
			problemDAO.problem_delete(p.getProblemId());
		});
		
		pboard_write_logic(pboard, problemList, problemChoiseList, printfileList, printfileArr);

	}

	@Override
	public void pboard_insert(PboardEntity pboard, List<ProblemEntity> problemList,
			List<List<String>> problemChoiseList, List<MultipartFile> printfileList, List<Integer> printfileArr) {
		pboardDAO.insert(pboard);
		pboard_write_logic(pboard, problemList, problemChoiseList, printfileList, printfileArr);

	}

	private void pboard_write_logic(PboardEntity pboard, List<ProblemEntity> problemList,
			List<List<String>> problemChoiseList, List<MultipartFile> printfileList, List<Integer> printfileArr) {

		problemList.forEach((p) -> {
			p.setPboardId(pboard.getPboardId());
		});
		int i = 0;
		for (ProblemEntity pe : problemList) {
			ProblemEntity currentPe = problemDAO.insert(pe);
			List<String> choiseList = problemChoiseList.get(i);
			if (choiseList != null) {
				choiseList.forEach((c) -> {
					problemDAO.problemChoise_insert(new ProblemChoiseEntity(currentPe.getProblemId(),
							Integer.toString(choiseList.indexOf(c)), c));
				});
			}
			int pfidx = 0;

			for (int n : printfileArr) {
				if (n == i) {
					try {
						problemDAO.printfile_insert(printfileList.get(pfidx), currentPe.getProblemId());
					} catch (IllegalStateException | IOException e) {
						e.printStackTrace();
					}
				}
				pfidx++;
			}
			i++;
		}

	}

	@Override
	public List<PboardCateEntity> pboardCate_findAll() {
		return pboardDAO.pboardCate_findAll();
	}

	@Override
	public List<ProblemCateEntity> problemCate_findAll() {
		return problemDAO.problemCate_findAll();
	}

	@Override
	public Page<PboardEntity> pboard_findByCate(int pboardCateId, org.springframework.data.domain.Pageable pageable) {

		return pboardDAO.pboard_findByCate(pboardCateId, pageable);
	}

	@Override
	public PboardEntity pboard_findById(String pboardId) {
		return pboardDAO.pboard_findByPboardId(pboardId);
	}

	@Override
	public void reply_insert(PboardReplyEntity pboardReply) {
		pboardDAO.reply_insert(pboardReply);
	}

	@Override
	public List<ProblemEntity> problem_findByPboardId(String pboardId) {

		return problemDAO.probleme_findByPboardId(pboardId);
	}

	@Override
	public PrintFileEntity printfile_findByProblemId(String problemId) {
		return problemDAO.printfile_findByPboardId(problemId);
	}

}
