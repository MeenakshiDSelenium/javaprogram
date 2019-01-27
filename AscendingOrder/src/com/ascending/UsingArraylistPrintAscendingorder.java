package com.ascending;

import java.util.ArrayList;

import java.util.Collections;

public class UsingArraylistPrintAscendingorder {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("meena");
		al.add("suma");
		al.add("obu");
		al.add("teja");
		al.add("kirthi");
		System.out.println("befor ascending order");
		for(String name:al) {
			System.out.println(name);
		}
		Collections.sort(al);
		System.out.println("after Ascending order");
		
		for(String names:al) {
			System.out.println(names);
		}
			
		ArrayList<String> a=new ArrayList<String>();
		a.add("meena");
		a.add("suma");
		a.add("obu");
		a.add("teja");
		a.add("kirthi");
		
		System.out.println("befor ascending order");
		for(int i=0;i<a.size();i++) {
		}
		System.out.println(a);
             Collections.sort(a);
             
             System.out.println("after sorting");
             for(int i=0;i<a.size();i++) {
            
             }
             System.out.println(a);

			}
          }


