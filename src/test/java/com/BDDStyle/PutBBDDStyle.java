package com.BDDStyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutBBDDStyle {
	
	@Test
	public void putBdd() {
		
		RestAssured.given().baseUri("http://localhost:3000/")
		.header("Content-Type" ,"application/json")
		.body("{\r\n" + 
						
						"    \"frst_name\": \"Safwan\",\r\n"+
						"    \"lastname\": \"Scremer\",\r\n" + 
						"    \"email\": \"Safwan@gmail.com\"\r\n" + 
						"}").when().put("Superhero/11").prettyPrint();
	}

}
