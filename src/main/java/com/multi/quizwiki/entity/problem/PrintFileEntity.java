package com.multi.quizwiki.entity.problem;

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
@Table(name = "print_file")
public class PrintFileEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String printFileId;
	int problemId;
	String origin;
	String store;
	
	
	public PrintFileEntity(int problemId, String origin, String store) {
		this.problemId = problemId;
		this.origin = origin;
		this.store = store;
	}
	
	
}
