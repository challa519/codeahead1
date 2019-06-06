package com.challa.codeahead1.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermArray {
	static ArrayList<Integer> temp=new ArrayList<Integer>();
	public static void main(String[] args) {
		ArrayList<Integer>	list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
	    temp.addAll(list);
		//perm(list, new ArrayList<Integer>());
	    //perm("","abc");
	    int a[]={1,2,3};
	    helper(0, a);
	}
   static void perm(List<Integer> l1, List<Integer> l2){
		if(l2.size()==3){
			System.out.println(l2);
			l2.clear();
			return;
		}
		for(int i=0;i<l1.size();i++){
			l2.add(l1.get(i));
			//l2.add
			ArrayList<Integer>	temp=new ArrayList<Integer>(l1);
			System.out.println(i+"--Temp----"+temp);
		    temp.remove(l1.get(i));
			perm(temp, l2);
			
		}
	}
   
   private static void helper(int start, int[] nums){
	    if(start==nums.length-1){
	      // System.out.println("--->"+Arrays.toString(nums));
	    }
	    for(int i=start; i<nums.length; i++){
	    	//System.out.println( i+ "---***-->"+start);
	        swap(nums, i, start);
	      //  System.out.println(Arrays.toString(nums));
	        helper(start+1, nums);
	        System.out.println( i+ "---###-->"+start);
	        swap(nums, i, start);
	    }
	}
   
   private static void swap(int[] nums, int i, int j){
	    int temp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = temp;
	}
   // String Permutation
	static void perm(String s1, String s2){
		if(s1.length()==3){
			System.out.println(s1);
		}
		for(int i=0;i<s2.length();i++){
			perm(s1+s2.charAt(i), s2.substring(0,i)+s2.substring(i+1, s2.length()));
		}
		
	}
}
