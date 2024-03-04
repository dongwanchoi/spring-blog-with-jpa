package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// ORM -> Java(다른언어 포함) Object -> 테이블로 매핑해주는 기술
@Data // 게터세터
@NoArgsConstructor // 빈생성자
@AllArgsConstructor // 전체 생성자
@Builder // 빌더패턴
@Entity //User 클래스가 MySQL에 테이블이 생성이 된다.	
//@DynamicInsert // insert시에 null인 필드를 제외시켜준다.
public class User { // 유저 테이블

	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; //시퀀스, auto_increment
	
	@Column(nullable = false, length = 100, unique = true) //null이 될 수 없고, 30자까지
	private String username; // 아이디
	
	@Column(nullable = false, length = 100) // 해쉬(비밀번호 암호화)
	private String password; // 비밀번호
	
	@Column(nullable = false, length = 50)
	private String email; // 이메일
	
//	@ColumnDefault("'user'") //Enum을 쓰는게 좋다. //ADMIN, USER 도메인 만들기 가능

	//DB는 RoleType이라는게 없다.
	@Enumerated(EnumType.STRING) //해당 Enum이 String이라고 알려줌
	private RoleType role;	//Enum안에 있는 ADMIN, USER 두개에 타입이 강제가 됨.  
	
	private String oauth; //kakao, google
	
	@CreationTimestamp //시간이 자동 입력
	private Timestamp createDate;
	
}



