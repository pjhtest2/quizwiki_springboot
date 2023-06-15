package com.multi.quizwiki.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.multi.quizwiki.entity.pboard.PboardCateEntity;
import com.multi.quizwiki.entity.pboard.PboardEntity;
import com.multi.quizwiki.entity.pboard.PboardReplyEntity;
import com.multi.quizwiki.repository.PboardCateRepository;
import com.multi.quizwiki.repository.PboardReplyRepository;
import com.multi.quizwiki.repository.PboardRepository;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Repository
public class PboardDAOImpl implements PboardDAO{
	
	PboardRepository pboardRepo;
	PboardCateRepository pboardCateRepo;
	PboardReplyRepository pboardReplyRepo;
	
	
	@Autowired
	public PboardDAOImpl(PboardRepository pboardRepo, PboardCateRepository pboardCateRepo,PboardReplyRepository pboardReplyRepo) {
		this.pboardRepo = pboardRepo;
		this.pboardCateRepo = pboardCateRepo;
		this.pboardReplyRepo = pboardReplyRepo;
	}
	
	
	

	@Override
	public void insert(PboardEntity pboard) {
		pboardRepo.save(pboard);
	}
	
	@Override
	public void pboard_edit(PboardEntity pboard) {
		System.out.println(pboard.getPboardId());
		PboardEntity data =  pboardRepo.findById(pboard.getPboardId()).get();
		data.setPboardContent(pboard.getPboardContent());
		data.setPboardTitle(pboard.getPboardTitle());
	}

	@Override
	public List<PboardCateEntity> pboardCate_findAll() {
		return pboardCateRepo.findAll();
	}


	@Override
	public Page<PboardEntity> pboard_findByCate(int pboardCateId, Pageable pageable) {
		return pboardRepo.findByPboardCateIdAndPboardStatusNot(pboardCateId,"d", pageable);
	}




	@Override
	public PboardEntity pboard_findByPboardId(String pboardId) {
		return pboardRepo.findById(pboardId).get();
	}




	@Override
	public void reply_insert(PboardReplyEntity pboardReply) {
		pboardReplyRepo.save(pboardReply);
	}

}
