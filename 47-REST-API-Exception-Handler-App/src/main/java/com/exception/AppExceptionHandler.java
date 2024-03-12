package com.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dto.ExceptionInfo;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> getAE(ArithmeticException ae)	
	{
		
		ExceptionInfo info=new ExceptionInfo();
		info.setErrorcode("SBI0008");
		info.setErrormsg(ae.getMessage());
		info.setErrordate(LocalDateTime.now());
		
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=NullPointerException.class)
	public ResponseEntity<ExceptionInfo> getNPE(NullPointerException npe)
	{
		ExceptionInfo info=new ExceptionInfo();
		info.setErrorcode("SBI0001");
		info.setErrormsg(npe.getMessage());
		info.setErrordate(LocalDateTime.now());
		
		return new ResponseEntity<>(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<ExceptionInfo> getUnf(UserNotFoundException exp)
	{
		ExceptionInfo info=new ExceptionInfo();
		info.setErrorcode("UNF0001");
		info.setErrormsg(exp.getMessage());
		info.setErrordate(LocalDateTime.now());
		
		return new ResponseEntity<>(info,HttpStatus.BAD_REQUEST);
		
	}
	
}
