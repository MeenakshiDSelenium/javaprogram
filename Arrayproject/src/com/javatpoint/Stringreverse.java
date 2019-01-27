package com.javatpoint;

public class Stringreverse {

	public static void main(String[] args) {
	String s="obulesu";
	String reverse="";
	//int size=s.length();
	//System.out.println(size);
	for(int i=s.length()-1;i>=0;i--) {
		reverse=reverse+s.charAt(i);
	}System.out.println(reverse);

	}

}
