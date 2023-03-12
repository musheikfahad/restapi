package com.BDDStyle;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ExternalJSONBdd {
	@Test
	public void postCreateSuperHeroFromJsonFile() {
		
		
		File jsonFile  = new File("fahad.json");
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type" ,"application/json")
		.body(jsonFile)
		.when()
		.post("Superhero")
		.prettyPrint();
	}

}
