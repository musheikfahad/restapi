package com.jsonwithjava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterAbstractClassPredicate {
	
	 static File jsonFile = new File("src\\test\\resources\\Bookstorejayway.json");

	 
	 ///one price <10
	public static void filterApiPredictExampleoneForPriceLessThan10() throws IOException{
		
		
		Filter priceLessThan10 = Filter.filter(Criteria
				.where("price").gt(10));
		
		List <Object> result = JsonPath.parse(jsonFile).read("$.store.book[?]", priceLessThan10);
	
		System.out.println(result);
	}
	
	
	//price <10 and Category fIction
	public static void filterApiPredictExampleoneForPriceGreater10andCategoryFiction() throws IOException {
		Filter priceGreaterthan10andFiction = Filter
		.filter(Criteria
				.where("price").lt(10)
				.and("category")
				.is("fiction")
				.and("title")
				.is("Moby Dick")
				
				);
		
	List<Object> result2 = JsonPath.parse(jsonFile).read("$.store.book[?]" ,priceGreaterthan10andFiction);
	System.out.println(result2);
	}
	
	//Orwe could store it in maps
	public static void filterApiPredictExampleoneForPriceGreater10andCategoryFictionStoredInMpaps() throws IOException {
		Filter priceGreaterthan10andFiction = Filter
		.filter(Criteria
				.where("price").lt(10)
				.and("category")
				.is("fiction")
				
				
				);
		
	List<Map<String ,Object>> result2 = JsonPath.parse(jsonFile).read("$.store.book[?]" ,priceGreaterthan10andFiction);
	System.out.println(result2);
	
	System.out.println(result2.get(0).get("author"));
	}
	
	//pric > 10 || category reference
	
	public static void filterpriceGt1oandCtegoryReference() throws IOException {
					Filter priceGreaterthan10andRference = Filter
			.filter(Criteria
					.where("category").lt(10)
					.and("category")
					.is("reference")
					
					
					);
			
		List<Map<String ,Object>> result3 = JsonPath.parse(jsonFile).read("$.store.book[?]" ,priceGreaterthan10andRference);
		System.out.println(result3);
		
		System.out.println(result3.get(0).get("author"));
		}
	
	public static void main(String[] args) throws IOException {
//		filterApiPredictExampleoneForPriceLessThan10();
//		filterApiPredictExampleoneForPriceGreater10andCategoryFiction();
//		filterApiPredictExampleoneForPriceGreater10andCategoryFictionStoredInMpaps();
		filterpriceGt1oandCtegoryReference();
		
	}
}
