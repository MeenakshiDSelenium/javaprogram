package com.meena;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String str1=str.replaceAll("[a-zA-Z]", "");
		System.out.println(str1);
		int count=0;
		String[] numbers=str1.split("");
		for(int i=0;i<numbers.length;i++) {
			int a=Integer.parseInt(numbers[i]);
			count=count+a;
		}
		System.out.println(count);

	}

}
