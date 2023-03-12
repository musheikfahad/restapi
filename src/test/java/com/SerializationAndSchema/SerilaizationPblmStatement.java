package com.SerializationAndSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SerilaizationPblmStatement {
	
	@Test
	public void serializationProcess() {
		
		//Assume processed data is iobtained
		Map<String ,Object> jsonBody = new HashMap<String ,Object>();
		
		jsonBody.put("First_Name " ,"Musheik ");
		
		jsonBody.put("Last Name", "Alikhan");
		
		jsonBody.put("Email", "musk@gmail.com");
		
		
		List<String> skillSet = new ArrayList<String>();
		
		skillSet.add("Java");
		skillSet.add("Phython");
		skillSet.add("Automation");
		
		
		jsonBody.put("Musheik's Skills", skillSet);
		
		System.out.println(jsonBody);
		
		// whwt if post above thing using rest assured
		
		RestAssured.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(jsonBody)
		.log()
		.all()
		.when()
		.post("/Superhero")
		.then()
		.log()
		.all();
		
	}

}
