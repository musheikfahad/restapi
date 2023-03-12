package com.SerializationAndSchema;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class REstAssuredJsonSchemaVAlidationNotThrougClassPath {

	@Test
	public void jsonSchemaValidationButFilenotinClassPath() {
		
		File jsonInput = new File("src/test/resources/input.json");
		
		File Scehma = new File("src/test/resources/Schema.json ");
		
		RestAssured.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type" ,"application/json")
		.body(jsonInput)
		.when()
		.post("/Superhero")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(Scehma));
		
	}
}
