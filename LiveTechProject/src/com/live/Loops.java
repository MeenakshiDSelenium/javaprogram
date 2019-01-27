package com.live;

public class Loops {

	public static void main(String[] args) {
		//using while loop
		/**int i=1;
		while(i<=10) {
			System.out.println("java is very easy:"+i);
			i++;
		}*/
		
		//using do while loop
		/**int j=1;
		do {
			System.out.println("selenium is very very easy:"+j);
			j++;
			
		}while(j<=10);*/
		
		//using for loop
		/**for(int i=10;i<=20;i=i+2) {
			System.out.println("value of:"+i);
		}*/
		
		//for eachloop using
		/**for(int i=1;i<=10;i++) {
			if(i==5)
				//break;
				continue;
			System.out.println(i);
		}*/
		
		/**int a=10;
		while(a>=0) {
			System.out.println(a);
			a--;
			
		}*/
		int a=456;
		int b=0;
		while(a!=0) {
		b=(b*10)+a%10;
		a=a/10;
		}
		System.out.println(b);
	}
}
