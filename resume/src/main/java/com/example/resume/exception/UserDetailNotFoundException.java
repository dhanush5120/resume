package com.example.resume.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "UserDetail Not Found")
public class UserDetailNotFoundException extends RuntimeException{
	
	public UserDetailNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		
		super(msg);
	}

}
