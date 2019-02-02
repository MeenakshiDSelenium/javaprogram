package com.deepu;

public class Stringreverse {

	public static void main(String[] args) {
		String s="i am the greatest programmer";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
		reverse=reverse+s.charAt(i);
	

	}
		System.out.println(reverse);
}
}