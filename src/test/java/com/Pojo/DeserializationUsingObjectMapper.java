package com.Pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationUsingObjectMapper {

	public static void main(String[] args) throws IOException {
		String json ="{\r\n" + 
				"     \r\n" + 
				"    \"firstName\": \"musheik\",\r\n" + 
				"    \"lastName\": \"fahath\",\r\n" + 
				"    \"iD\": 403\r\n" + 
				"  \r\n" + 
				"  }";
		
		
		ObjectMapper mapping = new ObjectMapper();
	Employee employee = mapping.readValue(json, Employee.class);
	System.out.println(employee.getFirstName());
	System.out.println(employee.getLastName());
	System.out.println(employee.getiD());
	
	
	}
}
