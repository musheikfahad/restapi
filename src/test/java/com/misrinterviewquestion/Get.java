package com.misrinterviewquestion;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Get {
	@Test
	private void getReq() {
		given()
		.param("page", 2)
		.auth()
		.none()
		.when()
		.get("https://reqres.in/api/users")
		.then()
		.statusCode(200).log().all()
		.body("page", equalTo(2));
		
	}

}
