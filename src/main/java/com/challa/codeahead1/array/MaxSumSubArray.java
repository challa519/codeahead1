package com.challa.codeahead1.array;

public class MaxSumSubArray {

    public static void main(String[] args) {
     int arr[] = {34, -50, 42, 14, -5, 86};
     int arr1[] = {-5, -1, -8, -9};
     System.out.println(maxSumSubArr(arr));
     System.out.println(maxSumSubArr(arr1));
    }
    private static int maxSumSubArr(int a[]) {
        int maxSum=0;
        int curSum=a[0];
        for(int i=1;i<a.length;i++) {
            curSum=curSum+a[i];
            if(maxSum<curSum) {
                maxSum=curSum;
            }else if(curSum<0) {
                curSum=0;
            }
        }
        return maxSum;
    }
}
