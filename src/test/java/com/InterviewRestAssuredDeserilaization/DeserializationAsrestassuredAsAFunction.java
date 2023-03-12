package com.InterviewRestAssuredDeserilaization;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;




public class DeserializationAsrestassuredAsAFunction {
	
	
	public static void asStoredAsMAp () {
		Map<String, Object> response = RestAssured
				.given()
				.baseUri("http://localhost:3000/")
				.when()
				.get("superhero/1")
		.then().extract().body().as(new TypeRef <Map<String , Object>>() {
		});
		
//		System.out.println(response);
		System.out.println(response.get("frst_name"));
		System.out.println(response.get("lastname"));
		System.out.println(response.get("email"));
		System.out.println(response.get("id"));

		
	}
	
//	public static void AsStoredAsListMAp() {
//	 RestAssured
//				.given()
//				.baseUri("http://localhost:3000/")
//				.when()
//				.get("superhero/1")
//		.then().extract().body().as(new TypeRef List {
//		});
//		
////		System.out.println(response);
////		System.out.println(response.get("frst_name"));
////		System.out.println(response.get("lastname"));
////		System.out.println(response.get("email"));
////		System.out.println(response.get("id"));
//
//	}

	public static void main(String[] args) {
		asStoredAsMAp();
	
	}

}
