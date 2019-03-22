package com.meena;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test6 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("meena");
		al.add("obu");
		al.add("hema");
		al.add("meena");
		al.add("suray");
		al.add("hema");
		System.out.println("contents of"+al);
		
		
		LinkedHashSet<String> lhs=new LinkedHashSet(al);
		
		System.out.println("contents of:"+ lhs);
		Iterator it=lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
