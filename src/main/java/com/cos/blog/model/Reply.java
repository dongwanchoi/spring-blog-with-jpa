package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 게터세터
@NoArgsConstructor // 빈생성자
@AllArgsConstructor // 전체 생성자
@Builder // 빌더패턴
@Entity //User 클래스가 MySQL에 테이블이 생성이 된다.	
public class Reply { //답변 테이블
	
	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; // 시퀀스, auto_increment
	
	@Column(nullable = false, length = 200)
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "boardId")
	private Board board;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user; //답변을 누가 적었는지 알아야 하기 위해
	
	@CreationTimestamp
	private Timestamp createDate;

	
//	@Override
//	public String toString() {
//		return "Reply [id=" + id + ", content=" + content + ", board=" + board + ", user=" + user + ", createDate="
//				+ createDate + "]";
//	}
	
}


