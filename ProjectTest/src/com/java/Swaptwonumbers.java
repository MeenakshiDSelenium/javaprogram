package com.java;

public class Swaptwonumbers {

	public static void main(String[] args) {
		int a=20,b=30;
		System.out.println("before swapping-a:"+a+",b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping-a:"+a+",b:"+b);

	}

}
