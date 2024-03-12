package com.dto;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class ExceptionInfo {

	private String errorcode;
	private String errormsg;
	private LocalDateTime errortime;
	
}
