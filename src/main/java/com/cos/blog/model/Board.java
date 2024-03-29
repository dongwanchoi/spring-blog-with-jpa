package com.cos.blog.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 게터세터
@NoArgsConstructor // 빈생성자
@AllArgsConstructor // 전체 생성자
@Builder // 빌더패턴
@Entity //User 클래스가 MySQL에 테이블이 생성이 된다.	
public class Board { // 게시글 테이블
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	private int id;

	@Column(nullable = false, length = 100)
	private String title;
	
	@Lob //대용량 데이터
	private String content; //섬머노트 라이브러리 <html>태그가 섞여서 디자인이 됨.
	
//	@ColumnDefault("0")
	private int count; //조회수
	
	//게시글을 누가 적었는지
	@ManyToOne(fetch = FetchType.EAGER) // Many = Board, User = One //한 명의 유저는 여러개의 게시글을 쓸 수 있다.
	@JoinColumn(name = "userId")
	private User user; //DB는 오브젝트를 저장할 수 없다. FK, 자바는 오브젝트를 저장할 수 있다.
//	private int userId;
	
	 // JPA cascade 옵션
	@OneToMany(mappedBy = "board", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE) // mappedBy 연관관계의 주인이 아니다 (난 FK가 아니에요) DB에 컬럼을 만들지 마세요.
	@JsonIgnoreProperties({"board"})
	@OrderBy("id desc")
	private List<Reply> replys;
	
	@CreationTimestamp //데이터가 insert, update가 될 때 자동으로 현재시간 값이 들어감
	private Timestamp createDate;
	
}
