package com.multi.quizwiki.dto;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.Data;
@Data
@Alias("qboard")
public class QboardDTO {
	private int qboard_id;
	private String member_id; //FK 회원아이디 varchar(20)
	private String title; // //게시물 제목
	private String content; //게시물내용 text
	private Timestamp regdate; // 게시물등록시간 datetime
	private Timestamp editdate; // 게시물 수정시간 datetime
	private int show_count; // 조회수 int
	private int like_count; // 좋아요수 int
	
	public QboardDTO() {
		
	}
}
