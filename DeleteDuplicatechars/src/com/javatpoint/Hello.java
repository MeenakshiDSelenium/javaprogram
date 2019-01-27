package com.javatpoint;

public class Hello {

	public static void main(String[] args) {
		String str="aabbccss";
		System.out.println(removeDuplicatechars(str));
	}
		private static String removeDuplicatechars(String sourcesStr){
			char[]chrArray=sourcesStr.toCharArray();
			String targetStr=" ";
			for(char value:chrArray) {
				if(targetStr.indexOf(value)==-1) {
					targetStr+=value;
				}
			}
			return targetStr;
			
		}

	}


