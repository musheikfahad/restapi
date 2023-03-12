package com.jsonwithjava;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

import groovyjarjarantlr4.v4.parse.ANTLRParser.option_return;

public class OtherTypesOfConfig {
	
	
	//11111111
	private  static void defaultConfig() {
		String jsonFile ="[\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"iPhone\",\r\n" + 
				"            \"number\": \"0123-4567-8888\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"home\",\r\n" + 
				"            \r\n" + 
				"        }\r\n" + 
				"    ]";
		
		Configuration config = Configuration.defaultConfiguration();
		
		String resultusingdefaultconfig = JsonPath.using(config).parse(jsonFile)
		.read("$.[0].number");
		
		System.out.println(resultusingdefaultconfig);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		String resultusingdefaultconfig222 = JsonPath.using(config).parse(jsonFile)
				.read("$.[1].number");
		
		System.out.println(resultusingdefaultconfig222);
	}
	
	//222222222222222

	private void method() {
		// TODO Auto-generated method stub

	}
public static void 	howToAddOtherTypesOfConfig(){
	
	String jsonFile ="[\r\n" + 
			"        {\r\n" + 
			"            \"type\": \"iPhone\",\r\n" + 
			"            \"number\": \"0123-4567-8888\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"            \"type\": \"home\",\r\n" + 
			"            \r\n" + 
			"        }\r\n" + 
			"    ]";
	
	Configuration config = Configuration.defaultConfiguration();
	
	config = config.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
	
	
	
	String resultusingdefaultconfig = JsonPath.using(config).parse(jsonFile)
	.read("$.[1].number");
	
	System.out.println(resultusingdefaultconfig);
	
	
	
		
	}

//3333333333333333333
static void otherWayOfAddingConfigSytax(){
	String jsonFile ="[\r\n" + 
			"        {\r\n" + 
			"            \"type\": \"iPhone\",\r\n" + 
			"            \"number\": \"0123-4567-8888\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"            \"type\": \"home\",\r\n" + 
			"            \r\n" + 
			"        }\r\n" + 
			"    ]";
	
	Configuration config = Configuration.builder()
			.options(Option.DEFAULT_PATH_LEAF_TO_NULL)
			.build();
	
	String resultusingdefaultconfig = JsonPath.using(config).parse(jsonFile)
	.read("$.[1].number");
	
	System.out.println(resultusingdefaultconfig);
	
	
}


//4444444444444444444
 static void takingTwoValuesAndStoringInlist()
 
{
	 String jsonFile ="[\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"iPhone\",\r\n" + 
				"            \"number\": \"0123-4567-8888\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"home\",\r\n" + 
				"            \r\n" + 
				"        }\r\n" + 
				"    ]";
		
		Configuration config = Configuration.builder()
				.options(Option.DEFAULT_PATH_LEAF_TO_NULL)
				.build();
		
	List<String>	 resultusingdefaultconfig = JsonPath.using(config).parse(jsonFile)
		.read("$..type");
		
		System.out.println(resultusingdefaultconfig);
	
}
 //5555555555555
 public static void gettinGSRringButStoringInlist(){
	 String jsonFile ="[\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"iPhone\",\r\n" + 
				"            \"number\": \"0123-4567-8888\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"home\",\r\n" + 
				"            \r\n" + 
				"        }\r\n" + 
				"    ]";
		
		Configuration config = Configuration.builder()
				.options(Option.DEFAULT_PATH_LEAF_TO_NULL)
				.build();
		
		List<String> resultusingdefaultconfig = JsonPath.using(config).parse(jsonFile)
		.read("$.[0].type");
		
		System.out.println(resultusingdefaultconfig);
	 
 }
 //666666666666666666666
 
 static void alwayStoreInlIst(){String jsonFile ="[\r\n" + 
			"        {\r\n" + 
			"            \"type\": \"iPhone\",\r\n" + 
			"            \"number\": \"0123-4567-8888\"\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"            \"type\": \"home\",\r\n" + 
			"            \r\n" + 
			"        }\r\n" + 
			"    ]";
	
	Configuration config = Configuration.builder()
			.options(Option.ALWAYS_RETURN_LIST)
			.build();
	
	List<String> resultusingdefaultconfig = JsonPath.using(config).parse(jsonFile)
	.read("$.[0].number");
	
	System.out.println(resultusingdefaultconfig);
	 
 }
 //7777777777777777777777777
 static void suppresException(){
	 
	 
	 String jsonFile ="[\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"iPhone\",\r\n" + 
				"            \"number\": \"0123-4567-8888\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"home\",\r\n" + 
				"            \r\n" + 
				"        }\r\n" + 
				"    ]";
		
		Configuration config = Configuration.builder()
				.options(Option.SUPPRESS_EXCEPTIONS)
				.build();
		
		List<String> resultusingdefaultconfig = JsonPath.using(config).parse(jsonFile)
		.read("$.[45].number");
		
		System.out.println(resultusingdefaultconfig);
 }
 //8888888888888888888888888888
 private  static void requiredproperties() {
	 String jsonFile ="[\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"iPhone\",\r\n" + 
				"            \"number\": \"0123-4567-8888\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"home\",\r\n" + 
				"            \r\n" + 
				"        }\r\n" + 
				"    ]";
		
		Configuration config = Configuration.builder()
				.options(Option.REQUIRE_PROPERTIES)
				.build();
		
		List<String> resultusingdefaultconfig = JsonPath.using(config).parse(jsonFile)
		.read("$.[*]");
		
		System.out.println(resultusingdefaultconfig);

}
	public static void main(String[] args) {
//		defaultConfig();
//		howToAddOtherTypesOfConfig();
//		otherWayOfAddingConfigSytax();
//		takingTwoValuesAndStoringInlist();
//		gettinGSRringButStoringInlist();
//		alwayStoreInlIst();
//		suppresException();
		requiredproperties();

	}

}
