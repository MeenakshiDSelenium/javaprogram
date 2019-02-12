package com.demo;

public class T2 extends T {
	public void m1() {
		System.out.println("it's a t2 method");
	}

	public static void main(String[] args) {
		T2 t=new T2();
		
		t.m1();
		t.m2();

	}

}
