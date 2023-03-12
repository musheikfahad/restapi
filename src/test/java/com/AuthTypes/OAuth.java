package com.AuthTypes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class OAuth {
	
	@Test
	public void Oauth2 () {
	String token = "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";
	 RestAssured
	.given().baseUri("https://api.github.com/user/repos")
	
	.auth()
	.oauth2(token)

	
	.when()
	.post()
	
	.prettyPrint();

}
}