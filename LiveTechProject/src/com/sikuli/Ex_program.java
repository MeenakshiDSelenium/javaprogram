package com.sikuli;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Ex_program {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		Screen sn=new Screen();
		Pattern minimise=new Pattern("E:\\minimse.PNG");
       Pattern broser=new Pattern("E:\\browser.PNG");
       Pattern close=new Pattern("E:\\close.PNG");
		//click on image
		sn.click(minimise);
		Thread.sleep(3000);
		sn.doubleClick(broser);
		Thread.sleep(3000);
		sn.click(close);
		
		
		
		
		
		
		
		
		
				
		

	}

}
