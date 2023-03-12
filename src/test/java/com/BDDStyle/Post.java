package com.BDDStyle;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Post {
	@Test
	@Ignore
	private void createSupe() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type" , "application/json")
		.body("{\r\n" + 
				 
				"    \"firstname\": \"Rhorsack\",\r\n" + 
				"    \"lastname\": \"dedective\",\r\n" + 
				"    \"email\": \"fhgjkl@gmail.com\"\r\n" + 
				"  }")
		.when()
		.post("/Superhero").time();

	}
@Test
	private void createAnotherSupe() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type" , "application/json","Authorization","yyiuyi")
		.body("{\r\n" + 
				 
				"    \"firstname\": \"Rquick\",\r\n" + 
				"    \"lastname\": \"flash\",\r\n" + 
				"    \"email\": \"fiuhiuhihkl@gmail.com\"\r\n" + 
				"  }")
		.when()
		.post("/Superhero")
		.then().statusCode(201).log().all();
	}
}
