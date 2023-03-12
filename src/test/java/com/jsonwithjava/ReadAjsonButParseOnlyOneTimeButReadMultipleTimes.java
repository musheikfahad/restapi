package com.jsonwithjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.io.*;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class ReadAjsonButParseOnlyOneTimeButReadMultipleTimes {

	public static void main(String[] args) throws IOException {
		InputStream jsonFile = new FileInputStream("src/test/resources/Bookstorejayway.json");
		
//	Object parsedJsonDocument =	Configuration.defaultConfiguration().jsonProvider().parse(jsonFile.readAllBytes());
//	
//	List<Object> categoryList = JsonPath.read(parsedJsonDocument, "$..category");
//	
//	
//	for (Object category : categoryList) {
//		System.out.println("cat of eachand everynok =" +category);
//	}
	}
}
