package com.meena;

import java.util.Scanner;

public class DemoStringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a String");
		String str=sc.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println(str);
		System.out.println(reverse);
		System.out.println(str.equals(reverse));
		if(str.equals(reverse)) {
			System.out.println("the given string is pallindrame");
			
		}
		else {
			System.out.println("the given string is not pallindrame");
		}

	}

}
