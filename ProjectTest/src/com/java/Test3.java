package com.java;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer>firstFiveprimarynumbers=new ArrayList<>();
		firstFiveprimarynumbers.add(1);
		firstFiveprimarynumbers.add(2);
		firstFiveprimarynumbers.add(3);
		firstFiveprimarynumbers.add(4);
		firstFiveprimarynumbers.add(5);
		
		
		List<Integer>firstTenprimarynumbers=new ArrayList<>(firstFiveprimarynumbers);
		
		
		List<Integer>nextFiveprimarynumbers=new ArrayList<>();
		nextFiveprimarynumbers.add(6);
		nextFiveprimarynumbers.add(7);
		nextFiveprimarynumbers.add(8);
		nextFiveprimarynumbers.add(9);
		nextFiveprimarynumbers.add(10);
		
		firstTenprimarynumbers.addAll(nextFiveprimarynumbers);
		System.out.println(firstTenprimarynumbers);
		

	}

}
