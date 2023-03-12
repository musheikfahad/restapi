package com.REstApi.RestAPi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutAKAupdateSUPERhero {

	@Test
	public void putSuperhero() {
		// 1) base Uri

		RestAssured.baseURI = "http://localhost:3000";

		// 2) Request specifications

		RequestSpecification reqq = RestAssured.given()
				.header("Content-Type" , "application/json")
				.body("{\r\n" + 
						
						"    \"frst_name\": \"taj\",\r\n"+
						"    \"lastname\": \"alikhan\",\r\n" + 
						"    \"email\": \"taj@gmail.com\"\r\n" + 
						"}")
				;

		// 3) type of request

		Response respp = reqq.request(Method.PUT, "/Superhero/8");

		// 4) Response body

		String ResponseBody = respp.asPrettyString();
		String statusLine = respp.getStatusLine();
		int statusCode = respp.getStatusCode();

		System.out.println("ResponseBody =" + ResponseBody);
		System.out.println("statusline =" + statusLine);

		System.out.println("statusCode =" + statusCode);

		// 5)000Validation

		Assert.assertEquals(statusCode, 201);
		
		System.out.println("Succesfully putted");
		
	}
}
