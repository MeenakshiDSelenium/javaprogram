package com.meena;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoM {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1,"meena");
		hm.put(2,"obu");
		hm.put(3,"hema");
		hm.put(4,"anu");
		System.out.println(hm);
		
		Iterator it=hm.entrySet().iterator();
		while(it.hasNext()) {
		//Map.Entry me=(Map.Entry)it.next();
		//System.out.println(""+me.getKey()+""+me.getValue());
		
			System.out.println(it.next());
		}
	}
}

