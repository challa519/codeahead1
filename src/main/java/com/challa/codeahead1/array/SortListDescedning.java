package com.challa.codeahead1.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortListDescedning {

	public static void main(String[] args) {
	Map<String, String> map=new HashMap<String, String>();
      List<Integer> list=new ArrayList<Integer>();
      list.add(10);
      list.add(12);
      list.add(5);
      list.add(15);
      list.add(7);
      list.add(20);
      Collections.sort(list, new MaxValueComparator());
      System.out.println(list);
	}

}
