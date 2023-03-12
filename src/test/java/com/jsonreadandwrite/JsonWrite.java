package com.jsonreadandwrite;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;

public class JsonWrite {
	public static void main(String[] args) throws IOException {
		//1) CCreate json object
		
		JSONObject jsobject = new JSONObject();
		
		//2) add key value pairs using put meth
		jsobject.put("Name", "Musheik");
		jsobject.put("Age", "5");
		
		
		//3) ceate obj for jon array then then add elements to it
		
		//Skils :["java" , "seleneium"]

		JSONArray jArray = new JSONArray();
		
		jArray.add("Kind eyes");
		jArray.add("big heart");
		
		
		//4)to add json Array to json obj again use put
		
		jsobject.put("Special Qualities",  jArray);
		
		
		FileWriter fileWriter = new FileWriter("Musheik.json");
		
		fileWriter.write(jsobject.toJSONString());
		
		fileWriter.close();
		
		
		
	}

}
