package com.jsonwithjava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonDocument {
	public static void main(String[] args) throws IOException {
		File jsonFile = new File("src/test/resources/Bookstorejayway.json");
		
//		try {
//			List<Object> pricelist = JsonPath.read(jsonFile, "$..price");
//			
//			for (Object price : pricelist) {
//				System.out.println(price);
//			}
//		} catch (Exception e) {
//			
//		}
		
		
		List<Map<Object ,Object>> priceList = JsonPath.read(jsonFile, "$..price");
		
		
		for (Object price : priceList) {
			System.out.println("Price of eachand everynok =" +price);
			
//			
//			Object store = JsonPath.read(jsonFile, "$.store");
//			
//			System.out.println(store);
		}
	}

}
