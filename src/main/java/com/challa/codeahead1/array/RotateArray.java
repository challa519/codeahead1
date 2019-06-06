package com.challa.codeahead1.array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int input[] = {6,3,9,11,1,3,5};
        RotateArray ra=new RotateArray();
        System.out.println(Arrays.toString(input));
        //ra.rotateRight(input);
        
        ra.rotateRight(input);
        System.out.println(Arrays.toString(input));
    }
    public void rotateRight(int arr[]) {
        int tmp=arr[0];
        for (int i=0;i<arr.length-1;i++) {
            int prv=arr[i+1];
            arr[i+1]=tmp;
            tmp=prv;
        }
        arr[0]=tmp;
    }
    public void rotateLeft(int arr[]) {
        int tmp=arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--) {
            int prv=arr[i-1];
            arr[i-1]=tmp;
            tmp=prv;
        }
        arr[arr.length-1]=tmp;
    }

}
