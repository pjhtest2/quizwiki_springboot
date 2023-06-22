package com.multi.quizwiki.qboard.dto;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
@Alias("comment_res")
@Getter
@Setter
public class CommentResponse {
			
		 	private Long commentId;                       // 댓글 번호 (PK)
		    private Long qboardId;                   // 게시글 번호 (FK)
		    private String content;                // 내용
		    private String memberId;                 // 작성자
		    private Boolean deleteYn;              // 삭제 여부
		    private LocalDateTime regDate;     // 생성일시
		    private LocalDateTime editDate;    // 최종 수정일시

}
