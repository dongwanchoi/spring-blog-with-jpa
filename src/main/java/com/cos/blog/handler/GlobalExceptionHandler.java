package com.cos.blog.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.dto.ResponseDto;

@ControllerAdvice //모든 Exception이 발생하면 여기로 들어옴
@RestController
public class GlobalExceptionHandler {

	@ExceptionHandler(value=Exception.class) //모든 Exception이 발생하면 Exception에 대한 에러를 이함수가 전달함
	public ResponseDto<String> handleArgumentException(Exception e) {
		return new ResponseDto<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage()); // 500에러
	}
}
