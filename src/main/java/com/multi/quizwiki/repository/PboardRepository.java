package com.multi.quizwiki.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.entity.pboard.PboardEntity;

public interface PboardRepository extends JpaRepository<PboardEntity, String>{
	public Page<PboardEntity> findByPboardCateIdAndPboardStatusNot(int pboardCateId,String pboardStatus, Pageable pageable);
	

}
