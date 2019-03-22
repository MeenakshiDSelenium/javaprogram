package com.java;


	class Test31{
		void meth(int i, int j)
		{
		i *= 2;
		
		i /= 2;
		
		}
	    }
		public class Argumentpassing 
		{
		public static void main(String args[])
		{
		Test31 ob = new Test31();
		Argumentpassing ab=new Argumentpassing();
		int a = 15, b = 20;
		System.out.println("a and b before call :"+ a +" " + b);
        ob.meth(a,b);
		System.out.println("a and b after call : "+ a + " " +b);
		}



	}


