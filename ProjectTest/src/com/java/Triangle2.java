package com.java;

public class Triangle2 {

	public static void main(String[] args) {
		String str="hai this is meena my qualification is mba";
		String[] words=str.split(" ");
		for(int i=0;i<=words.length-1;i++) {
			if(i%2!=0) {
				String word=words[i];
				String reverse="";
				for(int j=word.length()-1;j>=0;j--) {
					reverse=reverse+word.charAt(j);
				}
				System.out.println(reverse);
			}
			
			else {
				System.out.println(words[i]);
			}
		}

	}

}
