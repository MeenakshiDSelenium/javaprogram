package com.meena;

public class Test2 {
	static int a;
	static {
		a=4;
		System.out.println("it's a static blouck");
		System.out.println(a);
}

	//a=10;
	
	public void M2() {
		a=a+1;
		System.out.println("it's a narmal blouck");
	}
	


	public static void main(String[] args) {
		Test2 t=new Test2();
		t.M2();
		System.out.println(a);

	}

}
