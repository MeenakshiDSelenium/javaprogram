package com.javatpoint;

public class Char_reverse {

	public static void main(String[] args) {

		char[] letters1 = {'e', 'v', 'o', 'l', '4'};
		int i = letters1.length - 1, j = 0;
		char[] let = new char[letters1.length];
		while(i >= 0){
		     let[j] = letters1[i];
		     i--;
		     j++;
		}
		for (char c : let){
		     System.out.print(c);
}
		/* String[] a = { "Afyf", "Zgfj", "bgftyf", "cch"  };
		 
		         new Char_reverse().rev(a);
		 
		         System.out.println(java.util.Arrays.toString(a));
		 
		         Integer[] i = { 5, 4, 3, 2, 1  };
		 
		         new Char_reverse().rev(i);
		 
		         System.out.println(java.util.Arrays.toString(i));
		 
		     }
		 
		  
		 
	public <T> void rev(T[] array) {
		
		        T temp = null;
		
		        for(int i = 0;i < array.length - 2;i++) {
		
		            temp = array[i];
		
		            array[i] = array[array.length - i - 1];
		
		            array[array.length - i - 1] = temp;

		         }*/

	}	}


