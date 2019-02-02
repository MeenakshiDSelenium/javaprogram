package com.javatpoint;

import java.util.Scanner;

public class Sub_Arrayscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Scanner sc=new Scanner(System.in);
		    int s = sc.nextInt();
		    int[] arr = new int[s];
		    int[][] arrM = new int[s][s];
		    int count = 0;
		    for(int i=0;i<s;i++){
		        arr[i] = sc.nextInt();
		        if(arr[i] < 0) count++;
		        arrM[i][i] = arr[i];
		        for(int j=0;j<i;j++){
		            arrM[j][i] = arrM[j][i-1]+arr[i];
		            if(arrM[j][i] < 0)
		            	count++;
		        }
		    }
		    System.out.println(count);
		}
	

	}


