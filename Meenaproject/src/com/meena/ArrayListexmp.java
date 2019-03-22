package com.meena;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListexmp {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("meena");
		al.add("moni");
		al.add("meenakshi");
		al.add("monika");
		al.add("Anu");
		al.add("Anusha");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
          //System.out.println(al);
		}
	}
}

