package com.ascending;

import java.util.ArrayList;
import java.util.Collections;



public class DescendingOrder {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(3);
		a.add(6);
		a.add(4);
		System.out.println("befor descending order");
		for(Integer num:a) {
			System.out.println(num);
		}
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("after descending order");
		for(Integer nums:a) {
			System.out.println(nums);
		}  
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(6);
		al.add(7);
		al.add(5);
		al.add(4);
		System.out.println("befor descending order");
		
		for(int i=0;i<al.size();i++) {
			
		}
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("after descending order");
		for(int i=al.size()-1;i>=0;i--) {
			
		}
		System.out.println(al);
		
	}

}
