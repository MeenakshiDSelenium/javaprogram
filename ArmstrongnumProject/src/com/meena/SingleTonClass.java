package com.meena;



public class SingleTonClass {
	private static SingleTonClass s=null;
	private SingleTonClass() {
		
	}
	public static SingleTonClass getInstance() {
		if(s==null) {
			s=new SingleTonClass();
		}
		return s;
	}
	
	public void m1() {
		System.out.println("cncdvdjv");
	}
	public void m2() {
		System.out.println("JNFUWRHURRR");
	}

}
