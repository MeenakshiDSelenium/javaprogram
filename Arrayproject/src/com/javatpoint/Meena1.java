package com.javatpoint;

public class Meena1 {

	public static void main(String[] args) {
		int[]num= {10,15,3,7,2};
		int a=17;
		boolean b=false;
		for(int i=0;i<num.length;i++) {
			for(int j=i;j<num.length;j++) {
				if(num[j]+num[i]==a) {
					b=true;
					System.out.println(b);	
			}
			
			}
		}

	}

}
