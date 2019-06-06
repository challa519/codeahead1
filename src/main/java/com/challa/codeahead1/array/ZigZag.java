package com.challa.codeahead1.array;

import java.util.Arrays;

public class ZigZag {

    public static void main(String[] args) {
        int input[] = {6,3,9,11,1,3,5};
        ZigZag zigZag=new ZigZag();
        zigZag.zigZag(input);
        System.out.println(Arrays.toString(input));
    }

    public void zigZag(int arr[]) {
        for(int i=1 ; i< arr.length-1 ;i++) {
            if(arr[i-1] > arr[i]) {
                int temp=i-1;
                swap(arr,temp,i);
            }
            if(arr[i+1]>arr[i]) {
                int temp=i+1;
                swap(arr,temp, i);
            }
            i++;
        }
    }
    public void swap(int arr[],int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
