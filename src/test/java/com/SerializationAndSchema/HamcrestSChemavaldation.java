package com.SerializationAndSchema;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestSChemavaldation {

	@Test
	public static void hamcrest() throws IOException {
		File jsonInput = new File("src/test/resources/input.json");

		String jsonWeHave = FileUtils.readFileToString(jsonInput,"UTF-8");
		
		File jsonScehma = new File("src/test/resources/Schema.json ");
		
		
		MatcherAssert.assertThat(jsonWeHave, JsonSchemaValidator.matchesJsonSchema(jsonScehma));
		
		
	}

}
