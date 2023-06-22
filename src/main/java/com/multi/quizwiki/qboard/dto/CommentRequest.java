package com.multi.quizwiki.qboard.dto;

import org.apache.ibatis.type.Alias;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Alias("comment_req")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentRequest {

    private Long commentId;           // 댓글 번호 (PK)
    private Long qboardId;       // 게시글 번호 (FK)
    private String content;    // 내용
    private String memberId;     // 작성자

}
