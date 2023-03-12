package com.AuthTypes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BasicAuth {

	
	@Test
	public void baseAuthWithOutAuthentication() {
		
		
		RestAssured
		.given()
		.baseUri("https://postman-echo.com/")
		.when()
		.get("basic-auth")
		.prettyPrint();
	}
	
	@Test
	public void baseAuthWithAuthentication() {
		
		
		RestAssured
		.given()
		.auth()
		.basic("postman", "password")
		.baseUri("https://postman-echo.com/")
		.when()
		.get("basic-auth")
		.prettyPrint();
	}
	
	
}
