package com.vm.springboot.jwt.demo;
public class AuthenticateResponse {
	
	private final String jwt;

	public AuthenticateResponse(String jwt) {
		this.jwt = jwt;
	}
	
	public String getJwt() {
		return jwt;
	}
	
	

}