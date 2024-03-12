package com.exception.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dto.ExceptionInfo;
import com.exception.ContactNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value=ContactNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleCNF()
	{
		ExceptionInfo info = new ExceptionInfo();
		info.setErrorcode("CONT0001");
		info.setErrormsg("Contact Not Found");
		info.setErrortime(LocalDateTime.now());
		return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
	}
	
}
