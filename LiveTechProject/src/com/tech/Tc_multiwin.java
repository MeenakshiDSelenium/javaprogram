package com.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_multiwin {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("E:\\Selenium_Student_SW\\HtmlFiles\\multiplewindows.html");
		Thread.sleep(4000);
		System.out.println("open application");
		driver.findElement(By.id("btn1")).click();
		System.out.println("click on window1");
		Thread.sleep(5000);
		
		driver.quit();
		System.out.println("close all windows $ all browsers");

	}

}
