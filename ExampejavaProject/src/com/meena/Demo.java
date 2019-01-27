package com.meena;

public class Demo {
	static int i=012;
	static String s="meena";
	public static void m1() {
		System.out.println("obulesu");
	}
	public  void m2() {
		System.out.println("ganga");
	}
	static {
		System.out.println("cdsCSDSS");
	}

	public static void main(String[] args) {
		
		Demo d=new Demo();
        Demo.m1();
		d.m2();
		System.out.println(i);
		System.out.println(d.s);

	}

}
