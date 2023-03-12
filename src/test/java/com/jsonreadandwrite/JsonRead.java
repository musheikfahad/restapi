package com.jsonreadandwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.internal.runners.model.EachTestNotifier;

public class JsonRead {
	public static void main(String[] args) throws IOException, ParseException {
		
		//1)create object for JSONParser
		JSONParser jsparse = new JSONParser();
		
		//2)Using file reader class read that particular json file
		FileReader fileReadd = new FileReader("Musheik.json");
		
		//3)parse (divide into small units) the readfile using parse() method and store it in the object
		
		Object parsedObject = jsparse.parse(fileReadd);
		
		// 4)to read the values from parsed file use the get() metghod but to do that we have to convert OBJECT into JSON Object
		//and we type cast parsedobject into jsonobject
		
		JSONObject jsoObject = (JSONObject) parsedObject;
		
		
		Object Name = jsoObject.get("Name");
		//or
	//	String name = (String)jsoObject.get("Name");
		
		System.out.println("Name ="+ Name);
		
		
		
		Object Age = jsoObject.get("Age");
		
		//or
		
	//	Long age =  (Long) jsoObject.get("Age");
		System.out.println("Age ="+ Age);
		//5)now use get data from array we use json array
		
		JSONArray array = (JSONArray) jsoObject.get("Special Qualities");
		
		for (Object qualityskilss : array) {
			
			System.out.println("ALl features =" +qualityskilss);
			
		}
		
//		Iterator ite = array.iterator();
//		
//		while (ite.hasNext()) {
//			System.out.println("Special qualities ="+ite.next()) ;
//			
//		}
	}

}
