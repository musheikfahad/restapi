package com.InterviewRestAssuredDeserilaization;

import com.Pojo.Employee;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

public class DeseriliaxzationUsingJsonPath {
	
	public static void main(String[] args) {
		
		String json ="{\r\n" + 
				"     \r\n" + 
				"    \"firstName\": \"musheik\",\r\n" + 
				"    \"lastName\": \"fahath\",\r\n" + 
				"    \"iD\": 403\r\n" + 
				"  \r\n" + 
				"  }";
		
		JacksonMappingProvider mapprovide = new JacksonMappingProvider();
		
		Configuration configg = Configuration.builder()
		.mappingProvider(mapprovide)
		.build();
		
		Employee employee = JsonPath.using(configg)
		.parse(json).read("$" ,Employee.class);
		
		
		
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getiD());}

}
