package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 
//스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것은 아니구요.
//특정 어노테이션이 붙어있는 클래스 파일들을 new해서 (Ioc) 스프링 컨테이너에 관리해줍니다.
@RestController
public class BlogControllerTest {

	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello</h1>";
	}
	/*
		Get : 데이터를 줘 - Select
		Post : 데이터를 추가해줘 - Insert
		Put : 데이터를 수정해줘 - Update
		Delete : 데이터를 삭제해줘 - Delete
		
		
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		post 요청 - 패킷스위칭
		http헤더 : image/jpeg - 명시 Data 설명
		http바디 : my.jpeg - (실제 파일) Data
	*/
	
	
	
	
	
}
