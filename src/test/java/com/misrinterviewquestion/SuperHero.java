package com.misrinterviewquestion;

import com.BDDStyle.Post;

import io.restassured.RestAssured;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class SuperHero {
	@Test
	private void posting() {
		String nation = "India";
		RestAssured
		.given()                                //. //auth() //.basic(userName, password)
		.baseUri("http://localhost:3000/")
		.header("Content-Type" , "application/json")
		.body("{\r\n" + 
				 
				"    \"firstname\": \"bats\",\r\n" + 
				"    \"lastname\": \"dedective\",\r\n" + 
				"    \"email\": \"batcave@gmail.com\"\r\n" + 
				"  }")
		.when()
		.post("/Superhero").then().log().all()
		.body("firstname", equalTo("bat"))
		.body("lastname", equalTo("dedective"))
		.body("email", equalTo("batcave@gmail.com"));

	}

}
