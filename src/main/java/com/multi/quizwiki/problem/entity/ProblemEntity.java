package com.multi.quizwiki.problem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="problem")
public class ProblemEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int problemId;
	int problemCateId;
	int pboardId;
	String problemType;
	String problemContent;
	int problemIndex;
	String problemAnswer;
	String problemPrint;
	String problemDesc;
	String problemStatus;
	
	@Formula("(SELECT COUNT(1) FROM problem_like pl WHERE pl.problem_id = problem_id)")
	int problemLikeCount;
	
	@Formula("(SELECT COUNT(1) FROM problem_inquiry pl WHERE pl.problem_id = problem_id)")
	int problemInquiryCount;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "problemId")
	private List<ProblemChoiseEntity> problemChoiseList = new ArrayList<>();
	
	//처음엔 여러개 업로드하려다가 문제당 하나로 바꿔서 OneToOne이고 List가 아닌게 맞다 원래는..그래도 잘굴러가니
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "problemId")
	private List<PrintFileEntity> problemFileList = new ArrayList<>();
}
