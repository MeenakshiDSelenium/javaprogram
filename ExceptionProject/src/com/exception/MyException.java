package com.exception;

public class MyException {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		int c=15/0; //in this time will occured unchecked (runtime exception)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);//this is checked exception

	}

}
