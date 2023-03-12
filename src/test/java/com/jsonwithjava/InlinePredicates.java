package com.jsonwithjava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class InlinePredicates {
	public static void main(String[] args) throws IOException {
		//inline predicate
		
		
		File jsonFile = new File("src/test/resources/Bookstorejayway.json");
	List <Object> bookpricelessthan10 = JsonPath.read(jsonFile, "$.store.book[?(@.price<10)]");
	
	System.out.println(bookpricelessthan10);
	System.out.println("************************************************************************************************");
	
	List<Object> bppkbelow10rupees = JsonPath.parse(jsonFile).read("$.store.book[?(@.price<10)].price");
	
		System.out.println(bppkbelow10rupees);
		
		System.out.println("************************************************************************************************");
		
		
		//And logic predicate
		// [?(@.price<10 && @.category=='fiction')]
		//[?(@.price<10 && @.category=~/.*tion/i)]
		//[?(@.price<10 && @.category=~/.fic*/i)]
		
		List<Object> usingAndLogics = JsonPath.parse(jsonFile).read("$.store.book[?(@.price<10 && @.category=='fiction')]");
		
		System.out.println(usingAndLogics);
		System.out.println("**********************************************************************************");
		
List<Object> usingAndLogics2 = JsonPath.parse(jsonFile).read("$.store.book[?(@.price<10 && @.category=~/.*tion/i)]");
		
		System.out.println(usingAndLogics2);
		
		System.out.println("************************************************************************************************");
		
		System.out.println("ORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR logic");
List<Object> usingORLogics1 = JsonPath.parse(jsonFile).read("$.store.book[?(@.price>10 || @.category=~/.*ence/i)]");
		
		System.out.println(usingORLogics1);
	
	
	System.out.println("NOTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
	
	List<Object> usingNOTTTTLogics1 = JsonPath.parse(jsonFile).read("$.store.book[?(!( @.price>10 || @.category=~/.*ence/i))]");
	
	System.out.println(usingNOTTTTLogics1);
	System.out.println("********************************************************************************************");
	List<Object> usingNOTTLogics2 = JsonPath.parse(jsonFile).read("$.store.book[?(!( @.price<10 && @.category=='fiction'))]");
	
	System.out.println(usingAndLogics2);
	}
}


