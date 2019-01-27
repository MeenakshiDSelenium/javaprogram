package com.meena;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
	 
	    public static void main(String a[]){
	    	
	    	String str="meena dhanu kula dhanu";
	    	
	    	Map<String, Integer> dupMap = new HashMap<String, Integer>(); 
	        String[] chrs = str.split(" ");
	      //  System.out.println(chrs[3]); toCharArray();
	        for(String ch:chrs){
	            if(dupMap.containsKey(ch)){
	                dupMap.put(ch, dupMap.get(ch)+1);
	            } else {
	                dupMap.put(ch, 1);
	            }
	        }
	        Set<String> keys = dupMap.keySet();
	        for(String ch:keys){
	            
	                System.out.println(ch+"--->"+dupMap.get(ch));
	            
	        }
	    }

}
