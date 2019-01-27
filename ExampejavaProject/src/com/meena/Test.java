package com.meena;

public class Test {
	public void TwoMaxNumbers(int[]nums) {
	int maxone=0;
	int maxtwo=0;
	for(int n:nums) {
		if(maxone<n) {
		maxtwo=maxone;
		maxone=n;
		}
		else if(maxtwo<n){
				maxtwo=n;
				}
		}
	System.out.println("maxnumber"+maxone);
	System.out.println("maxnumber"+maxtwo);
}

	public static void main(String[] args) {
		int num[]= {66,55,88,52,33,9,99};
		Test t=new Test();
		t.TwoMaxNumbers(num);
}}
