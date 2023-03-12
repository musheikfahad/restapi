package com.RequestSpecificationInterview;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class DefaultReqSpecification {

	RequestSpecification reqspec;

	@BeforeTest
	public void defaultReqSepecification() {

		reqspec = RestAssured.given().baseUri("http://localhost:3000").basePath("/Superhero");

		RestAssured.requestSpecification = reqspec;

	}

	@Test
	public void getALLSupes() {
		RestAssured.given()

				.when().get().prettyPrint();
	}

	@Test
	public void getParticularEmployee() {
		RestAssured.given()

				.when().get("/1").prettyPrint();

	}

	@Test@Ignore
	public void postAnEmployee() {
		
		RequestSpecification specification = RestAssured.given()
				.contentType(ContentType.JSON)
				.baseUri("http://localhost:3000")
				.basePath("/posts");
		
		
		RestAssured
		.given()
		
		.body("{\r\n" + 
			
				"    \"frst_name\": \"Nila\",\r\n"+
				"    \"lastname\": \"alikhan\",\r\n" + 
				"    \"email\": \"houseofnila@gmail.com\"\r\n" + 
				"}")
		.when()
		.post()
		.prettyPrint();
		

	}
}
