package com.meena;

public class Test {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			
			for(int j=1;j<=8;j++) {
				if(i==1||i==2||i==7||i==8) {
				System.out.print("*");
			}
			
			else {
				
				if(j==3||j==4||j==6) {
					
						System.out.print(" ");
					}
				else {
					System.out.print("*");
				}
				}
			}
			System.out.println();
		}

	}

}
