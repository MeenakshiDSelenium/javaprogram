package com.Ganga;

public class Ganga {
	/**public void m1() {
		System.out.println("m1 method Executed");
	}
	public void m2() {
	System.out.println("m2 method Executed");	
	}
	public void m3() {
		System.out.println("m3 method Executed");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to selenium training");
		Ganga g=new Ganga();
		g.m1();
		g.m2();
		g.m3();
	}
}**/
	
/**	public void selenumID() {
		System.out.println("seleniumID Executed");
	}
	public void seleniumwebDriver() {
		System.out.println("seleniumwebDriver Executed");
	}
	public void seleniumGrid() {
		System.out.println("seleniumGrid Executed");
	}
	
	public static void main(String args[]) {
		Ganga g=new Ganga();
		g.selenumID();
		g.seleniumwebDriver();
		g.seleniumGrid();
		}**/
	//Narmal methods
	/**public void method1() {
		System.out.println("failure is the key success; each mistake teaches us something");
	}
	public void method2() {
		
		System.out.println("come together is a beginning;keeping together is progress;working together is success");
	}
	public void method3() {
		System.out.println("in a day,when you don't come acrossany problems - you can be sure that you are travilling in a wrong path");
	}
	
	//static methods 
		public static void methoed4() {
			System.out.println("Daily I will practce practice selenium for 2hours");
		}
		public static void method5() {
			System.out.println("Daily I will sleep only for 6hours");
		}
		public static void method6() {
			System.out.println("Daily I will wake up at 6clock");
		}
	
	public static void main(String args[]) {
		System.out.println("*** i have not failed.I've just found 10,000 ways that won't work***");
		//Narmal methods Execution
		Ganga g=new Ganga();
		g.method1();
		g.method2();
		g.method3();
		
		//ststic methods Execution
		Ganga.methoed4();
		Ganga.method6();
		Ganga.method5();
		
	}**/
	int i=20;//instanec variable
	static int j=30;//static variable
	public void d1() {
		int a=10;//local variable
		System.out.println("D1 Executed");
		System.out.println("Local variable:"+a);
	}
	public void d2() {
		System.out.println("D2 Executed");
		System.out.println("instanec ver:"+i);
		System.out.println("static veriable:"+j);
	}
	public static void D3() {
		System.out.println("D3 static method Executed ");
	}
	public static void main(String args[]) {
		Ganga d=new Ganga();
		//Executed methods by using object
		d.d1();
		d.d2();
		//instenec  variable Execution
		System.out.println(d.i);
		//static method And variable Exection
		D3();
		Ganga.D3();
		System.out.println(Ganga.j);
		
	}
	
}


