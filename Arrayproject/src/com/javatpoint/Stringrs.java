package com.javatpoint;

public class Stringrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="meenakshi";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			
				}
		System.out.println(reverse);

	}

}
