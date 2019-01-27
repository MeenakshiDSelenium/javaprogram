package com.javatpoint;

public class Ganga {
/**	char ch;
	   void show() {
	   System.out.println(ch==0);
	 //  System.out.println(ch=='');//invalid and compilation error
	   System.out.println(ch=='\u0000');
	   }
**///
	public static void main(String[] args) {
	/**	char c1='a';
		char c2='b';
	//	char c3=c1+c2;//it's a compilation error
		System.out.println(c1);
		System.out.println(c2);
		//System.out.println(c3);
		**/
		
	/**	int i=123;
		byte c=a;// invalid **/
		
		
		
	/**	byte b=111;
		int a=b;
		System.out.println(a);
		System.out.println(b);**/
		
	/**	final byte b1=90;
		final byte b2=9;
		byte b3=b1+b2; 
		System.out.println(b3);
		System.out.println(b1);
		System.out.println(b2);**/
		
		/**
		int d=90+9;
		int j=90;
		int x=9;
		System.out.println("sum is"+(j+x));
		System.out.println(d);
		
		**/
	/**	String s="90"+9;
		System.out.println(s);
		String s1=9+"99";
		String s2="90"+"9";
		System.out.println(s1);
		System.out.println(s2); **/
		
		/**
		int a=10;
		int b=20;
		int c=4;
		int d=(a+b)*c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
                               **/
		
	/**	long a=123L;
		//double b=123.45;
		double b=a;
		
		System.out.println(a);
		System.out.println(b);
		
		
		int a1=123;
		int b1=12+23;
		System.out.println(a1);
		System.out.println(b1);
		
		//Ganga g=new Ganga();
	//	g.show();
		
		 final int a3;
		 a3=99;
		 System.out.println(a3);
			
		final int j=100;
		System.out.println(j);
	//	j=88;//it's compilaion error why because final key word used so we can't change
		//System.out.println(j);**/
		
		for(int i=1;i<=10;i++) {
			System.out.println(i*20);
		}
		
		
	}

}
