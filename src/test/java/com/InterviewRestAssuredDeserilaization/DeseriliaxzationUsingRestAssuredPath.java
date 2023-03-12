package com.InterviewRestAssuredDeserilaization;

import static org.testng.Assert.assertEquals;

import com.Pojo.Employee;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DeseriliaxzationUsingRestAssuredPath {
	
	
	public static void main(String[] args) {
		String json ="{\r\n" + 
				"     \r\n" + 
				"    \"firstName\": \"musheik\",\r\n" + 
				"    \"lastName\": \"fahath\",\r\n" + 
				"    \"iD\": 403\r\n" + 
				"  \r\n" + 
				"  }";
		
		String asPrettyString = RestAssured.given()
		.when().get(" http://localhost:3000/Superhero/1").asPrettyString();
		
		JsonPath fromThisJsonPath = JsonPath.from(json);
		
		Employee emp = fromThisJsonPath.getObject("$", Employee.class);
		String love = "india";
		
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		
		emp.getiD();
		assertEquals(emp.getiD(), 406);
		
		
	}
	
	

}
