package com.challa.codeahead1.array;

import java.util.Arrays;

public class SwapNumbers {

    public static void main(String[] args) {
        int arr[]= {7,5,8,3,4,2,9,11};
        swapNumberIfBig(arr);
        System.out.println(Arrays.toString(arr));

    }
    
    private static void swapNumberIfBig(int arr[]) {
        if(arr==null || arr.length<2) return;
        int j=0;
        for(int i=1;i<arr.length;i++) {
            if(arr[j]<arr[i]) {
                swap(arr,i,j);
            }
            j++;
        }
    }
    
    public static void swap(int arr[],int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
