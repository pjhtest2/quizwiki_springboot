package com.multi.quizwiki.dto;



import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("solv")
public class SolvDTO {
	private String solv_id;
	private int problem_id;
	private String member_id;
	private String solv_answer;
	private String solv_edit_date;
	private boolean solv_right;
	
	private ProblemDTO problem;
}
