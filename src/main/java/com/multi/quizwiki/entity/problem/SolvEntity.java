package com.multi.quizwiki.entity.problem;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "solv")
public class SolvEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String solvId;
	int problemId;
	String memberId;
	String solvAnswer;
	@UpdateTimestamp 
	Timestamp solvEditDate;
	
	
	public SolvEntity(int problemId, String memberId, String solvAnswer) {
		this.problemId = problemId;
		this.memberId = memberId;
		this.solvAnswer = solvAnswer;
	}
	
	
	
}
