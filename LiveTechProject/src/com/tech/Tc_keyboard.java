package com.tech;



import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_keyboard {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://localhost/orangehrm/orangehrm-2.6/login.php");
		System.out.println("open Appliccation");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		//perform tab and enter keyboard actions
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		System.out.println("login completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		Thread.sleep(3000);
		driver.close();
		

	}

}
