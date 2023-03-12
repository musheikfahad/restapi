package com.jsonwithjava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class FlentAPIRead {

	static File jsonFile = new File("src/test/resources/Bookstorejayway.json");

	public static void FluentApiFirstMath() throws IOException {
		DocumentContext context = JsonPath.parse(jsonFile);

		List<Object> categoryList = context.read("$..category");

		for (Object bookCatgory : categoryList) {

			System.out.println(bookCatgory);

		}
	}

	public static void FluentApiusingConfigclass() throws IOException {
		Configuration configgg = Configuration.defaultConfiguration();
		List <Object> categoryList2 = JsonPath.using(configgg).parse(jsonFile).read("$..category");
		
		for (Object bookCatgory : categoryList2) {

			System.out.println(bookCatgory);

		}
	}
	
	
	public static void main(String[] args) throws IOException {
		FluentApiFirstMath();
		System.out.println("Secondmeth****************************************");
		FluentApiusingConfigclass();

	}

}
