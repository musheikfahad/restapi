package com.RequestSpecificationInterview;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ReqSpecGivenVsWith {
	
	RequestSpecification reqSpec ;
	
	@BeforeTest
	public void setReqSpecificationexaple(){
	 reqSpec = RestAssured.with().baseUri("http://localhost:3000")
		.basePath("/posts");
		
		
	}
	
	@Test
	public void getALLSupes(){
		RestAssured
		.given()
		.spec(reqSpec)
		.when()
		.get()
		.prettyPrint();
	}

	@Test
	public void getParticularEmployee() {
		RestAssured
		.given()
		.spec(reqSpec)
		.when()
		.get("/1")
		.prettyPrint();
		
	}
}
