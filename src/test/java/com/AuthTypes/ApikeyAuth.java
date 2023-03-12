package com.AuthTypes;

import org.junit.Ignore;
import org.testng.annotations.Test;

import static io.restassured.RestAssured .*;

public class ApikeyAuth {
	@Test(enabled = true)
public	void apiKeyAuthh(){
		
		
		given()
//		.baseUri("https://api.openweathermap.org/data/2.5/weather?q=Chennai&appid=54de22975b29cb6b5c267f2213240e46")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather?q=Ramanathapuram&appid=54de22975b29cb6b5c267f2213240e46")
		.prettyPrint();
		
	}
	
//	@Test
//	@org.testng.annotations.Ignore
	
	public void apiKeyAuthUSingQueryParams(){
		given()
		.queryParam("q", "Madurai")
		.queryParam("appid", "3e55a2f5b0a16cde2ab51fc24afd956f")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.prettyPrint();
	//	ORRRRRRr
		
//		.get("https://api.openweathermap.org/data/2.5/weather")
//		.then()
//		.log()
//		.body();
	}
	
	
	@Test
	public void voidapikeyUsingHeader () {
		
		
		given()
		.queryParam("q", "Texas")
		.header("apiid","3e55a2f5b0a16cde2ab51fc24afd956f")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log()
		.body();
	}
	
	
	
	
	

}
