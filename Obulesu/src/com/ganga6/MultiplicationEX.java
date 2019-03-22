package com.ganga6;

import java.util.Scanner;

public class MultiplicationEX {

	public static void main(String[] args) {
		int x=4;
		for(int y=1;y<=10;y++) {
			System.out.println(x+"*"+y+"="+(x*y));
			//System.out.println(x*y);
		}
		
		
		Scanner sr=new Scanner(System.in);
		System.out.println("enter number");
		int a=sr.nextInt();
        for(int i=1;i<=10;i++) {
		  System.out.println(a+"*"+i+"="+(a*i));
			
		}

	}

}
