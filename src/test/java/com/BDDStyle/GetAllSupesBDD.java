package com.BDDStyle;

import org.junit.Ignore;
import org.testng.annotations.Test;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class GetAllSupesBDD {
	
	@Test
//	@org.testng.annotations.Ignore
public void getAllSuperheros() {
//		RestAssured.
		 ValidatableResponse all = given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("Superhero").then().statusCode(200).statusLine("HTTP/1.1 200 OK").log().all();
		 
		 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		 
		
		
		
	
}
//	@Test
	@org.testng.annotations.Ignore
	public void getOnlyOneSuperHero() {
		
//		RestAssured.
		ValidatableResponse statusCode = given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/Superhero/2").then().statusLine("HTTP/1.1 200 OK").log().all();
		
		
	
		
		
		
	}
}
