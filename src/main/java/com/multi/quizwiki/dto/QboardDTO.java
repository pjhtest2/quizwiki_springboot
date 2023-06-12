package com.multi.quizwiki.dto;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Alias("qboard")
@AllArgsConstructor
@NoArgsConstructor
public class QboardDTO {
	private int qboard_id;
	/*
	 * private String member_id; //FK 회원아이디 varchar(20) private String
	 * board_cate_id;
	 */
	private String title; // //게시물 제목
	private String content; //게시물내용 text
	private Timestamp regdate; // 게시물등록시간 datetime
	/*
	 * private Timestamp editdate; // 게시물 수정시간 datetime private int show_count;
	 * private int like_count;
	 */
	
	
	
	
}
	