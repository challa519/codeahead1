package com.challa.codeahead1.list;

import java.util.ArrayList;
import java.util.*;

public class MergeKSortedList {

	public static void main(String[] args) {
		List<ListNode> lists=new ArrayList<ListNode>();
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(3);
		l1.next.next=new ListNode(5);
         lists.add(l1);
        ListNode l2=new ListNode(2);
        l2.next=new ListNode(4);
        lists.add(l2);
        
        ListNode l3=new ListNode(2);
        l3.next=new ListNode(4);
        l3.next.next=new ListNode(7);
        lists.add(l3); 
        
        System.out.println(getString(mergeKList(lists)));
	}
	static ListNode mergeKList(List<ListNode> lists){
        if(lists ==null ||  lists.size() == 0) return null;  
        
        System.out.println("******"+lists.size());
        if(lists.size() == 1) return lists.get(0);
        List<ListNode> newList=new ArrayList<ListNode>();
        for(int i=0; i<lists.size(); i++)
        {
            ListNode l1=lists.get(i);
            i++;
            ListNode l2=null;
            if( i<lists.size()){
                l2=lists.get(i);
            }
            System.out.println(l1+ "---"+l2);
            ListNode merge=merge(l1,l2);
            System.out.println("hell---" +getString(merge));
            newList.add(merge);
        }
       System.out.println("---"+newList.size());
      return mergeKList(newList);
    }
   
   static  ListNode merge(ListNode l1, ListNode l2)
    {
	   
       if(l1==null && l2==null) return null;
       System.out.println(1);
       
        if(l1==null) return l2;
        System.out.println(2);
        if(l2==null) return l1;
        
        System.out.println(3);
        ListNode head=null;
        if(l1.val <= l2.val){
            head=l1;
            l1=l1.next;
        }else{
            head=l2;
            l1=l2.next;
        }
        head.next=null;
        ListNode current=head;
        while( l1!=null && l2!=null ){
            if(l1.val<=l2.val){
                current.next=l1;
                l1=l1.next;
            }else {
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        if(l1!=null)
            current.next=l1;
        if(l2!=null)
             current.next=l2;
        
        return head;
    }
    
    static String  getString(ListNode list){
		String temp="";
		while(list!=null){
			temp=temp+list.val;
			list=list.next;
		}
		return temp;
	}

}
