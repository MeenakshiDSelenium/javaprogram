package com.meena;

import java.util.HashMap;
import java.util.Map;

class Employee{
	int id;
	public Employee(int id) {
		this.id=id;
	}
}

public class Demo134{ 
	public static void main(String[] args) {
		
		Map<Integer, String> map1=new HashMap<>();
		Integer i=new Integer(1);
		Integer i1=new Integer(1);
		
		System.out.println(i.hashCode());
		System.out.println(i1.hashCode());
		map1.put(i, "jjj");
		map1.put(i1, "nnaaamsaf");
		System.out.println(map1.size());
		

	}

}
