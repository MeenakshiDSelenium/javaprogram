package com.javatpoint;

import java.util.HashSet;
import java.util.Set;

interface I{
	default void m1() {
		System.out.println("Aknsribgd");
	}
	public static  void m2() {
		System.out.println("ajkbvksgvfs");
	}
}
public class Hello1 {
	/* void m1() {
		System.out.println("hhhh");
	}
*/
	public static void main(String[] args) {
		String str="aabbccs";
		char[]characters=str.toCharArray();
		
		Set s=new HashSet();
		HashSet hs=new HashSet();
		
		StringBuilder sb=new StringBuilder();
		System.out.println("String with duplicates:"+str);
		for(char c: characters) {
			if(!s.contains(c)) {
				s.add(c);
				sb.append(c);
				
				
			}
		}
		System.out.println("String after duolicates:"+sb.toString());
		

	}

}
