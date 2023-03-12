package com.jsonwithjava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;
//To handle definite path
public class ReturnTypeDEfiniteAndIndefinite {
	public static void main(String[] args) throws IOException {
		File jsonFile = new File("src/test/resources/Bookstorejayway.json");
		
		String author = JsonPath.read(jsonFile, "$.store.book[0].author");
		
		
		System.out.println(author);
		
		
		List <Object> authorList = JsonPath.read(jsonFile, "$.store.book[2].author");
		for (Object author2 : authorList) {
			System.out.println(author2);
			
		}
		
			
	}
}
