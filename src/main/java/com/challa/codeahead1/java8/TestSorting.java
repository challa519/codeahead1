package com.challa.codeahead1.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSorting {
	Comparator<Developer> byName = 
			(Developer o1, Developer o2)->o1.getName().compareTo(o2.getName());
	public static void main(String args[]){
		
		Comparator<Developer> byName = 
				(Developer o1, Developer o2)->o1.getName().compareTo(o2.getName());
	}
	
	
	
	private static List<Developer> getDevelopers() {
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		
		return result;

	}

}
