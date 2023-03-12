package com.RequestSpecificationInterview;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class ReqSpecBuilder {

	public static void main(String[] args) {
		
		//buildingSpecs
		RequestSpecBuilder builddd = new RequestSpecBuilder();
		
RequestSpecification	specc = 	builddd.setBaseUri("http://localhost:3000")
									.setBasePath("/posts")
									.build();
		
		
		//or
		
		
//		builddd.setBaseUri("http://localhost:3000");
//		builddd.setBasePath("/posts");
//		
//		//making the build as usable
//		RequestSpecification specc = builddd.build();
		
		//using customized spec
		
		RestAssured.given()
		.spec(specc)
		.get()
		.prettyPrint();
	}

}
