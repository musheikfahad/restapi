package com.REstApi.RestAPi;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostSupes {
	@Test
	public void createASupes() {
		//1) Base URI
		
		RestAssured.baseURI = ("http://localhost:3000/");
		
		
		//2 Req specifications
		
		RequestSpecification reqq = RestAssured.given()
				.header("Content-Type" , "application/json")
				.body("{\r\n" + 
						"    \"id\": \"11\",\r\n"+
						"    \"frst_name\": \"musheik\",\r\n"+
						"    \"lastname\": \"alikhan\",\r\n" + 
						"    \"email\": \"mush@gmail.com\"\r\n" + 
						"}")
				;
		
		
		//3) req type
		
		Response respp = reqq.request(Method.POST, "Superhero");
		
		
		//response body
		String ResponseBody = respp.asPrettyString();
		String statusLine = respp.getStatusLine();
		int statusCode = respp.getStatusCode();
		
		System.out.println("ResponseBody =" +ResponseBody);
		System.out.println("statusline ="+statusLine);
		
		System.out.println("statusCode ="+statusCode);
		
		
		//validation
		
		
		Assert.assertEquals(statusCode, 201);
		System.out.println("Succesfully posted");
	}

}
