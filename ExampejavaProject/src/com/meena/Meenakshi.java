package com.meena;

import java.util.ArrayList;
import java.util.Iterator;

public class Meenakshi {
	
	public void m1(int aa) {
		int a=10;
		System.out.println("jjcdmcdjndj");
		if(a==10) {
			System.out.println("meena");
		}
		else {
			System.out.println("surya");
		}
		
		synchronized(this) {
			
		}
		
		System.out.println("jancdjadj");
	}

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("meena d");
		al.add("meenakshi");
		al.add("d meena");
		al.add("dhanikula meena");
		
		Iterator<String> it = al.iterator();
		
		while (it.hasNext()) {
			
			al.remove(0);
			
			System.out.println(it.next());
				
		

	}

	}
}
