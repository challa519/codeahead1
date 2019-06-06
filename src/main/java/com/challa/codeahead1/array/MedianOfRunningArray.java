package com.challa.codeahead1.array;

import java.util.PriorityQueue;

public class MedianOfRunningArray {
    PriorityQueue<Integer> p1=new PriorityQueue<Integer>(2);
    PriorityQueue<Integer> p2=new PriorityQueue<Integer>(2);
    
    public static void main(String args[])
    {
        MedianOfRunningArray mRunArr=new MedianOfRunningArray();
        mRunArr.add();
        
    }
   
    private  int add() {
        p1.add(3);
        p1.add(5);
        p1.add(1);
       return p1.peek();
    }

}
