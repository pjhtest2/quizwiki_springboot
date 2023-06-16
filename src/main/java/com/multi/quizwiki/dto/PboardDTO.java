package com.multi.quizwiki.dto;


import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Alias("pboard")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PboardDTO {
	private int pboard_id; //문제게시물ID int
	private String member_id; //FK 회원아이디 varchar(20)
	private int pboard_cate_id; // FK 문제분류ID int
	private String pboard_title;
	private String pboard_content; //게시물내용 text
	private String pboard_reg_date; // 게시물등록시간 datetime
	private String pboard_edit_date; // 게시물 수정시간 datetime
	private int pboard_show_count; // 조회수 int
	private int pboard_like_count; // 좋아요수 int
	private String pboard_status; //게시물상태flag varchar(1)
	
}
