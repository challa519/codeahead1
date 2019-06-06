package com.challa.codeahead1.array;

import java.util.TreeSet;
import java.util.SortedSet;

public class ContainsDuplicate3 {

	public static void main(String[] args) {
		int nums[] = {1,0,1,1};
		 int   nums1[]={1,5,9,1,5,9};
		 System.out.println(containsDuplicate3(nums,1,0));
		//System.out.println(containsDuplicate3(nums1, 2, 3));
	}
	public static boolean containsDuplicate3(int arr[], int k, int t){
		if(arr==null || arr.length<0 || k<0 || t<0) return false;
		

	    TreeSet<Long> set = new TreeSet<Long>();
	    for(int i=0; i<arr.length; i++){
	        long curr = (long) arr[i];
	        long leftBoundary = (long) curr-t;
	        long rightBoundary = (long) curr+t+1; //right boundary is exclusive, so +1
	        System.out.println(leftBoundary+"---"+rightBoundary);
	        SortedSet<Long> sub = set.subSet(leftBoundary, rightBoundary);
	        System.out.println("size---->"+sub.size()+"---"+sub);
	        if(sub.size()>0)
	            return true;
	        set.add(curr);   
	        System.out.println(set);
	        if(i>=k){ // or if(set.size()>=k+1)
	            set.remove((long)arr[i-k]);
	        }
	    }
	 
	    return false;
	}

}
