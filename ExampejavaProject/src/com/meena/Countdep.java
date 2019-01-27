package com.meena;

import java.util.HashMap;

public class Countdep {

	public static void main(String[] args) {
		String str="meenakshi";
		HashMap<Character,Integer> m=new HashMap<Character,Integer>();
		for(char ch:str.toCharArray()){
			if(m.containsKey(ch)) {
				int val=m.get(ch);
				m.put(ch,val+1);
				
			}
			else {
				m.put(ch,1);
			}
			
		}
		System.out.println(m);

	}

}
