package com.deepu;

public class S {

	public static void main(String[] args) {
		String s="hai meena how are u";
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			for(int j=0;j<word.length();j++) {
				if(j==1) {
					String s1="";
					s1=s1+word.charAt(j);
					System.out.println(s1);
				}
				
			}
			
		}
		
	}




	}


