package com.deepu;

public class Mycalculation extends Calculation{
	
	public void multiplication(int x,int y) {
		z=x*y;
		System.out.println("the given product number is"+z);
	}

	public static void main(String[] args) {
		int a=20,b=10;
		Mycalculation my=new Mycalculation();
		my.add(a , b);
		my.subtraction(a, b);
		my.multiplication(a, b);
 
	}

}
