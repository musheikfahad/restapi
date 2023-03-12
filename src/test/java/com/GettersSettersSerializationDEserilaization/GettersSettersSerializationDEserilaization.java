package com.GettersSettersSerializationDEserilaization;

import java.util.Arrays;

import com.Pojo.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GettersSettersSerializationDEserilaization {
	
	 static String supeJson;
	 static ObjectMapper mapping = new ObjectMapper();
	static SuperHero supe = new SuperHero();
	private static  void serialization() throws JsonProcessingException {
		//Seralization
		
				
				
				
				
				supe.setFirstName("Bruce Wayne");
				supe.setAlteregoName("BatMan");
				supe.setComicbook("Detective Comics");
				supe.setSkillSets(Arrays.asList("Rich" , "Genius","plsyboy" , "gadget"));
				
				
				 supeJson = mapping.writerWithDefaultPrettyPrinter().writeValueAsString(supe);
				
				System.out.println(supeJson);

	}

	
	private static void deSerialization() throws JsonMappingException, JsonProcessingException {
		
		
		 mapping.readValue(supeJson, SuperHero.class);
		System.out.println(supe.getFirstName());
		System.out.println(supe.getAlteregoName());
		System.out.println(supe.getComicbook());
		
	
		System.out.println(supe.getSkillSets());
		
		

	}
public static void main(String[] args) throws JsonProcessingException {
	serialization();
	System.out.println();
	System.out.println("###########################################");
	deSerialization();
	
}
}
