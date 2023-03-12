package com.REstApi.RestAPi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getsingleemployee {
	@Test
	public void getOnlySuperMAn(){
		//1) bAse URI set up
		RestAssured.baseURI="http://localhost:3000/";
		
		//2)Request Specufications
		
		RequestSpecification reqq = RestAssured.given();
		
		//3) Request Type
		
		Response response = reqq.request(Method.GET,"Superhero/3");
		
		System.out.println(response);
		
		////  here we got the memory address as an output which stored the Response body..
		
		// we need the response body and status code
		
		//4) response body
		String ResponseBody = response.asPrettyString();
		
		String statusLine = response.getStatusLine();
		
		int statusCode = response.getStatusCode();
		
		System.out.println("statusCode =" +statusCode);
		
		System.out.println("ResponseBody =" + ResponseBody);
		
		System.out.println("statusLine =" + statusLine);
		
		//5) Validation
		
		Assert.assertEquals(statusCode, 200);
		System.out.println("validation successful");
		
	}

}
