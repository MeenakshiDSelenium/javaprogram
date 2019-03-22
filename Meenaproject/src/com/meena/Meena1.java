package com.meena;

import java.util.HashMap;
import java.util.Iterator;

public class Meena1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(55,"meena");
		hm.put(56,"anu");
		hm.put(57,"moni");
		hm.put(58,"mahi");
		
		System.out.println(hm);
		Iterator it=hm.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		}

	}


