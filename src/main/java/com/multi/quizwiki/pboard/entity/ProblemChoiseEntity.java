package com.multi.quizwiki.pboard.entity;

import java.sql.Timestamp;

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
@Table(name = "problem_choise")
public class ProblemChoiseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String problemChoiseId;
	String problemId;
	String problemChoiseIndex;
	String problemChoiseContent;
	
	public ProblemChoiseEntity(String problemId, String problemChoiseIndex, String problemChoiseContent) {
		this.problemId = problemId;
		this.problemChoiseIndex = problemChoiseIndex;
		this.problemChoiseContent = problemChoiseContent;
	}
	
	
}
