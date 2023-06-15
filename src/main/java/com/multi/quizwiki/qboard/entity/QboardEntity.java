package com.multi.quizwiki.qboard.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.multi.quizwiki.qboard.dto.QboardDTO;

import lombok.Data;

@Data
@Entity
@Table(name ="qboard")
public class QboardEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long qboardId;
	private String memberId;
	private String title;
	private String content;
	@CreationTimestamp
	private Timestamp regDate;
	@UpdateTimestamp
	private Timestamp editDate;
	int comment_Count;
	int like_Count;
	int view_Count;
	
	public static QboardEntity toSaveEntity(QboardDTO qboard) {
		QboardEntity qboardEntity = new QboardEntity();
		qboardEntity.setQboardId(qboard.getQboard_id());
		qboardEntity.setMemberId(qboard.getMember_id());
		qboardEntity.setTitle(qboard.getTitle());
		qboardEntity.setContent(qboard.getContent());
		qboardEntity.setRegDate(qboard.getRegdate());
		qboardEntity.setEditDate(qboard.getEditDate());
		
		return qboardEntity;
	}
}
