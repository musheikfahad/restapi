package com.SerializationAndSchema;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredGetmethod {
	@Test
	public void validationUsingJsonSchemaInClassPath() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("/Superhero/2")
		.then().statusCode(200)
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema.json"));
		
	}

}
