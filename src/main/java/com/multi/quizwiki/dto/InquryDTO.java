package com.multi.quizwiki.dto;



import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("inqury")
public class InquryDTO {
	private String inqury_id;
	private String member_id;
	private String inqury_category;
	private String inqury_comment;
	private String inqury_title;
	private String inqury_content;
	private Date inqury_date;
}

