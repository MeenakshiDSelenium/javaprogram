package com.javatpoint;

public class Sub_Arrays {
	//Function to print all sub arrays with 0 sum present in the given arrays
	public static void printallsubarrays(int[] a) {
		for(int i=0;i<a.length;i++) {
		int sum=0;
	//	consider all sub_arrrys Starting from i
		for(int j=i;j<a.length;j++) {
			//sum of elements so far
			sum += a[j];
			//if sum is seen before,we have found a subarray with 0 sum
			if(sum == 0) {
				System.out.println("subarray ["+i+".."+j+"]");
			}
		}
		}
	}

	public static void main(String[] args) {
		int[] a= {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
		printallsubarrays(a);
		

	}

}
