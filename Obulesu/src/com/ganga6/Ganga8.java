package com.ganga6;

import java.util.Scanner;

public class Ganga8 {


	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("1add");
		System.out.println("2sub");
		System.out.println("3mul");
		System.out.println("4div");
		System.out.println("enter first num");
		int a=s.nextInt();
		System.out.println("enter second num");
		int b=s.nextInt();
		System.out.println("enter your choice");
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
			default:
				System.out.println("invalid choiec");
			
			
		
		}
		
	
}
	}
	


