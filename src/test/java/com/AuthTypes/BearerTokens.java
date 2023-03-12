package com.AuthTypes;

import io.restassured.RestAssured;

public class BearerTokens {

	public static void main(String[] args) {
		String token = "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";
		 RestAssured
		.given()
		.baseUri("https://api.github.com/user/repos")
		.header("Authorization","Bearer "+token)
		
		.when()
		.get()
		.prettyPrint();
		 
		 
		
	}
}
