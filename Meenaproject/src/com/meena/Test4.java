package com.meena;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("om");
		al.add("sri");
		al.add("sai");
		al.add("Ram");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("obu");
		al2.add("ganga");
		
		al.addAll(al2);
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
