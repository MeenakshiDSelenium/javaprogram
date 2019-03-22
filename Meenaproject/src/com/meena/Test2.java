package com.meena;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		System.out.println(al);
		al.add("g");
		System.out.println("After add:"+ al);
		al.remove("d");
		System.out.println("After remove:"+ al);
			
		}

	}


