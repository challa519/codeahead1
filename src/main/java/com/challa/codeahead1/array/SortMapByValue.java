package com.challa.codeahead1.array;
import java.util.*;
public class SortMapByValue {

	public static void main(String[] args) {
// a Map with string keys and integer values
	    Map<String, Integer> budget = new HashMap<String, Integer>();
	    budget.put("clothes", 120);
	    budget.put("grocery", 150);
	    budget.put("transportation", 100);
	    budget.put("utility", 130);
	    budget.put("rent", 1150);
	    budget.put("miscellneous", 90);
	    
	 // let's sort this map by values first
	    Map<String, Integer> sorted = budget
	        .entrySet()
	        .stream()
	        .sorted(Map.Entry.comparingByValue())
	        .collect(java.util.stream.Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
	                LinkedHashMap::new));
	  System.out.println(sorted);
	   sorted = budget
		        .entrySet()
		        .stream()
		        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		        .collect(java.util.stream.Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
		                LinkedHashMap::new));
	   
	   System.out.println(sorted);
	}

}
