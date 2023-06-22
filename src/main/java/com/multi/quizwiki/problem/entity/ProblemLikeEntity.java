package com.multi.quizwiki.problem.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="problem_like")
public class ProblemLikeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int problemLikeId;
	int problemId;
	String memberId;
	
	public ProblemLikeEntity(int problemId , String memberId) {
		this.problemId = problemId;
		this.memberId = memberId;
	}
}
