package com.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AuthenticationResponse implements Serializable{

	private final String jwt;
	
}
