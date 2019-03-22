package com.java;



public class Charactercount {

	public static void main(String[] args) {
		String s="bhGajabjaahssaadadasadaasa";
		char[ ] c=s.toCharArray();
		 int count=0;
		for(int i=0;i<c.length;i++) {
			char d='a';
			if(c[i]==d) {
				count++;
				
			}
		}
			System.out.println("a si:"+count);
		}

	}


