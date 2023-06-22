package com.multi.quizwiki.problem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="problem_inquiry")
public class ProblemInquiryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int problemInquiryId;
	String memberId;
	int problemId;
	String problemInquiryContent;
	
	public ProblemInquiryEntity(String memberId,int problemId , String problemInquiryContent) {
		this.memberId = memberId;
		this.problemId = problemId;
		this.problemInquiryContent = problemInquiryContent;
	}
}
