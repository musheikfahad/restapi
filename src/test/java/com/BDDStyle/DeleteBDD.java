package com.BDDStyle;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteBDD {
@Test
@Ignore
	public void deleteBDD() {
		   ValidatableResponse statusCode = RestAssured.given()
		.baseUri("http://localhost:3000/")
		.when()
		.delete("Superhero/6").then().statusCode(200);
		;
		
		
		 

		
		
	}
@Test
public void deleteBDD2() {
	  RestAssured.given()
	.baseUri("http://localhost:3000/")
	.when()
	.delete("Superhero/7").then().statusCode(201);
	 
	
	
	
}
}
