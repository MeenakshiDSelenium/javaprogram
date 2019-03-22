package com.javatpoint;

public class StarPattren {

	public static void main(String[] args) {
		int n=1;
		Boolean b=false;
		for(int i=0;i<5;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
				if(n==5){
					b=true;
				}
			}
			System.out.println();
			if(b==true){
				n=n-2;
			}
			else {
				n=n+2;
			}
		}

	}

}
