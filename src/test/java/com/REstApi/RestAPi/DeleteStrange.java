package com.REstApi.RestAPi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteStrange {
	@Test
	public void deleteStrange() {
		
		//1)baseuri
		RestAssured.baseURI= "http://localhost:3000/";
		
		
		//2)req spec
		
		RequestSpecification reqq = RestAssured.given();
		
		//3) type of req
		
		Response respp = reqq.request(Method.DELETE,"Superhero/11");
		
		
		//// 4) Response body

		String ResponseBody = respp.asPrettyString();
		String statusLine = respp.getStatusLine();
		int statusCode = respp.getStatusCode();

		System.out.println("ResponseBody =" + ResponseBody);
		System.out.println("statusline =" + statusLine);

		System.out.println("statusCode =" + statusCode);

		// 5)000Validation

		Assert.assertEquals(statusCode, 200);
		
		System.out.println("Succesfully deleted");
		
	}

}
