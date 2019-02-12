package com.demo;

public class T extends t1 {
	public void m2() {
		System.out.println("it's a t class method");
	}

	public static void main(String[] args) {
		T t=new T();
		t.m1();
		t.m2();

	}

}

class t1{
	
	public void m1() {
		System.out.println("it's a t1 class method");
	}
	
	
	public static void main (String[]args) {
		
	}
}




