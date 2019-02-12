package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	WebDriver driver;
	//=========varibles=======
	public String url="http://localhost/orangehrm/orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
	
	
	public String txt_loginname="txtUserName";
	public String txt_password="Password";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String link_pim="PIM";
	public String link_Employee= "Welcome admin";
			

}
