package com.meena;

public class Test {
	int i=10;
	String s="meena";
	Float f=10.5f;
	public void m1() {
		System.out.println("hello");
	}
	public void m2() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		t.m2();
		System.out.println(t.i);
		System.out.println(t.s);
		System.out.println(t.f);
	}

}
