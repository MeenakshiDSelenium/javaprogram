package com.live;

public class Testif_ifelse_ifelseif_nestedif {

	public static void main(String[] args) {
		//if statement
		int i=10;
		if(i<15) {
			System.out.println("this is if statement");
			
		}
		//if else statement
		int j=10;
		if(j>15) {
			System.out.println("this statement true");
		}
		else {
			System.out.println("this is false");
		}  //example:2
		int a=35;
		if(a<=36) {
			System.out.println("this is pass");
		}
		else {
			System.out.println("this is failed");
		}
		//if else if statement
		int b=40;
		
		if(b==10) {
			System.out.println("this is true");
		}else if(b==20) {
			System.out.println("this is true");
		}else if(b==30) {
			System.out.println("this is true");
		}else if(b==40) {
			System.out.println("this is true");
		}
		else {
			System.out.println("this is false");
		}
		//this is nested ifstatement
		int c=20;
		int d=50;
		if(c==20) {
			if(d==50) {
				System.out.println("this is ok");
			}
			else {
				System.out.println("this is failed");
			}
		}
		else {
			System.out.println("this is not ok");
		}
		int e=20;
		int f=50;
		if(e==21) {
			if(f==55) {
				System.out.println("this is ok");
			}
			else {
				System.out.println("this is failed");
			}
		}
		else {
			System.out.println("this is not ok");
		}
		int r=20;
		if(r>=18) {
			System.out.println("it's eligibility");
		}
		else {
			System.out.println("not eligibility");
		}
	}

}
