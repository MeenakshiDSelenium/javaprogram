package com.meena;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChars {

	public static void main(String[] args) {
		String str="meenakshi";
    	
    	Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
      
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            }
            else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
        	
            
                System.out.println(ch+"--->"+dupMap.get(ch));
            
        }

	}

}
