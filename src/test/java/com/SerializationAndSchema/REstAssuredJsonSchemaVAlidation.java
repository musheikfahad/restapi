package com.SerializationAndSchema;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class REstAssuredJsonSchemaVAlidation {
	
	@Test
	public void validationUsingJsonSchemaInClassPath() {
		
		File inputjson = new File("src/test/resources/input.json");
		RestAssured.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type" ,"application/json")
		.body(inputjson)
		.when()
		.post("/Superhero")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema.json"));
	}

}
