package com.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_101_varifyLogin {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/orangehrm/orangehrm-2.6/login.php");
		System.out.println("open application");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("login into application");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("back to home");
		driver.close();
		System.out.println("close browser");

	}

}
