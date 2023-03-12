package com.BDDStyle;

import org.testng.annotations.Test;

import static io.restassured.RestAssured .*;

public class CreateASuperHeroByPostUsingBDD {
	@Test
	public void createASupePostUsingBddStyle() {
		
//		RestAssured
		String firstname ="quick silver";
		
		String x_men= "maximoff";
		
		String mail = "houseofM@gmail.com";
		given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type" , "application/json")
		
		.body("{\r\n" + 
				
				"    \"firstname\": \""+firstname +",\r\n" + 
				"    \"lastname\": \""+x_men +",\r\n" + 
				"    \"email\": \""+mail+"\r\n" + 
				"  }")
		.when()
		.post("/Superhero").then()
		.statusCode(201).log().all();
		

	}

}
