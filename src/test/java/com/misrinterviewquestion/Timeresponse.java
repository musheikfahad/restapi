package com.misrinterviewquestion;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.ptg.LessThanPtg;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Timeresponse {
	@Test
	private void getTime() {
		Response getResponseTime = given()
		
		.auth()
		.none()
		.when()
		.get("https://reqres.in/api/users?page=2");
		
		int statusCode = getResponseTime.getStatusCode();
		assertEquals(statusCode, 200);
		
	long time = getResponseTime.getTime();
	long timeIn = getResponseTime.getTimeIn(TimeUnit.SECONDS);
	long time2 = getResponseTime.time();
	long timeIn2 = getResponseTime.timeIn(TimeUnit.SECONDS);
	
	
	
	
//		
		
	}
	
	@Test
	private void getTime2() {
		given()
		.param("page", 2)
		.auth()
		.none()
		.when()
		.get("https://reqres.in/api/users")
		.then();
//		.statusCode(200).log().all().time(lessThan(4000));
		//.body("page", equalTo(2));
		
	}

}
