package com.deepu;

import java.io.IOException;

class Testt{
	public void m1()  {
	System.out.println("super");
}
	
}
public class Deepika {
	public void m1()throws IOException {
		System.out.println("sub");
		
	}
	
	

	public static void main(String[] args) {
		
		try {
			System.out.println("nkdklkb");
			Deepika d=new Deepika();
			d.m1();
		}
		catch(Exception e) {
			System.out.println(e);
	}
		


		

	
	}
}
