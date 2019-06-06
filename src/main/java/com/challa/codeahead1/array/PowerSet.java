package com.challa.codeahead1.array;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	
	/*
	 * *
	 * 0,1, 2
	 * {[],[0],[1],[2],, [1]} 
	 * 
	 */
	

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        List<List<Integer>> subsets = getSubsets(list, 0);
        System.out.println(subsets.toString()); 
        //ArrayList<ArrayList<Integer>> subsets1 = getAllSubsets(list);
        //System.out.println(subsets1.toString()); 
    }
    public static List<List<Integer>> getSubsets(ArrayList<Integer> set, int index) {
       List<List<Integer>> allsubsets;
        if (set.size() == index) { // Base case - add empty set
            allsubsets = new ArrayList<List<Integer>>();
            allsubsets.add(new ArrayList<Integer>()); 
        } else {
            allsubsets = getSubsets(set, index + 1);
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
            for (List<Integer> subset : allsubsets) {
                ArrayList<Integer> newsubset = new ArrayList<Integer>();
                newsubset.addAll(subset); 
                newsubset.add(item);
                moresubsets.add(newsubset);
            }
            allsubsets.addAll(moresubsets);
        }
        System.out.println(allsubsets);
        return allsubsets;
    }

    private static ArrayList<ArrayList<Integer>> getAllSubsets(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
        int max = 1 << set.size(); 
        for (int i = 0; i < max; i++) {
            ArrayList<Integer> subset = new ArrayList<Integer>();
            int k = i;
            int index = 0;
            while (k > 0) {
                if ((k & 1) > 0) {
                    subset.add(set.get(index));
                }
                k >>= 1;
                index++;
            }
            System.out.println(subset.toString());
            allsubsets.add(subset);
        }
        return allsubsets;
    }
}
