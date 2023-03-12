//package com.jsonwithjava;
//
//import com.google.common.base.Predicate;
//import com.jayway.jsonpath.Predicate.PredicateContext;
//import com.sun.javafx.collections.MappingChange.Map;
//
//public class CustomizedPredicate {
//
//	
//	
//	
//	
//	public static void main(String[] args) {
//		com.jayway.jsonpath.Predicate bookswithISBn = new com.jayway.jsonpath.Predicate() {
//			
//			public boolean apply(PredicateContext ctx) {
//				boolean predicate = ctx.item(Map.class).containsKey("Isbn");
//				return predicate;
//			}
//		};
//		
//		//or lambda expression
//		
//		com.jayway.jsonpath.Predicate bookswitISBN = ctx->ctx.item(java.util.Map.class).cotainsKey("isbn");
//		
//		List<>
//	}
//
//}
