package com.Pojo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Multiset.Entry;

import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class EmployeeAccess {
	
	public static void main(String[] args) throws IOException {
		Employee employee1 = new Employee();
		
		employee1.setFirstName("Musheik");
		
		employee1.setLastName("Alikhan");
		
		employee1.setiD(12);
		
		employee1.setSkillSets(Arrays.asList("Java" ,"Selenium" ,"maryam"));
		
		
		
		
		
		//Getter
		
		System.out.println(employee1.getFirstName());
		System.out.println(employee1.getLastName());
		System.out.println(employee1.getiD());
		System.out.println(employee1.getSkillSets());
		
		
		// to print in json 
		
		
		ObjectMapper empjson = new ObjectMapper();
		
		String writeValueAsString = empjson.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
		
		
		RestAssured.given()
		.baseUri("http://localhost:3000/Superhero")
		.header("Content-Type","application/json")
		.body(writeValueAsString)
		.when()
		.post().then().statusCode(201).body("firstName", equalTo("Musheik"));
//		System.out.println(writeValueAsString);
		

		
	}

}
