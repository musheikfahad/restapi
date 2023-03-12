package com.SerializationAndSchema;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import javax.print.DocFlavor.INPUT_STREAM;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class SchemaValusingNWNt {
	
	@Test
 public void jsonSchemaUsingNetworkNt() throws IOException {
	 
	 //1) create object for jackson obj maker
	 
	 ObjectMapper mapper = new ObjectMapper();
	 
	 //2) create instance (obj) for njsonSchemaFactory (networkEntry) using GetInstance and pass 
	 // the version of schema we have used
	 
	 JsonSchemaFactory facty = JsonSchemaFactory.getInstance(VersionFlag.V4);
	 
	 //3) using readtrwee() fn of jackson databinder convert the jason file into JsonNode
	 
	 
	 
	 File  inputJson = new File("src/test/resources/input.json");
		
		
	 JsonNode jsonNode = mapper.readTree(inputJson);
	 
	 //4) using the factory object read the schema input
	 
	 InputStream inputSchema = new FileInputStream("src/test/resources/Schema.json");
	 
	 JsonSchema schema = facty.getSchema(inputSchema);
	 
	 //5)Validate the schema against the json node using validate fn
	 
	 Set<ValidationMessage> validatedResult = schema.validate(jsonNode);
	 
	 
	 //6) to test to pass set shoulb be empty
	 
	 if (validatedResult.isEmpty()) {
		
		 System.out.println("No validation Error");
		 
	}
	 else {
		 for (ValidationMessage Message : validatedResult) {
				
			 System.out.println(Message);
			}
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
}
