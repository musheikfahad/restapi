package com.pojodesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.*;

public class ProphetpojoAccess {
	public static void main(String[] args) throws JsonProcessingException {
		Prophetpojo det = new Prophetpojo();

		det.setFirstName("mohamed");
		det.setNationality("Universal");
		det.setQualities(Arrays.asList("Calm", "Charming", "Beautifull", "Kind"));

		//
		kids obj = new kids();

		List<kids> chill = new ArrayList<kids>();

		obj.setKname("kasim");
		obj.setAge(12);
		obj.setGender("male");

		chill.add(obj);

		kids obj2 = new kids();

		obj2.setKname("hasan");
		obj2.setAge(35);
		obj2.setGender("male");

		chill.add(obj2);
		
		
		det.setKidss(chill);
		
		// mapper

		ObjectMapper mapp = new ObjectMapper();

		String jsonoutput = mapp.writerWithDefaultPrettyPrinter().writeValueAsString(det);

		System.out.println(jsonoutput);

		//upload post json data
		
		
		ValidatableResponse bodygg = RestAssured.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type" , "application/json")
		.body(jsonoutput)
		.when()
		.post("/Superhero")
		.then()
		.log()
		.all().statusCode(201)
		.body("firstname", equalTo("mohamed"))
		.body("nationality", equalTo("Universal"))
		.body("qualities[0]", equalTo("Calm"))
		.body("qualities[1]", equalTo("Charming"))
		.body("qualities[2]", equalTo("beautifull"))
		.body("qualities[3]", equalTo("Kind"))
		.body("kids.kname", equalTo("kasim"))
		.body("kids.age", equalTo(12))
		.body("kids.gender", equalTo("male"))
		.body("kids.kname", equalTo("hasan"))
		.body("kids.age", equalTo(35))
		.body("kids.gender", equalTo("male"));
		
		
		
		
		
		
	}

}
