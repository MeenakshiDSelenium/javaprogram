package com.meena;

public class Test {

	public static void main(String[] args) {
		
		SingleTonClass s=SingleTonClass.getInstance();
		s.m1();
		s.m2();
	}

}
