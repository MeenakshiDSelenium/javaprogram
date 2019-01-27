package com.tech;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_WinHan {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\Selenium_Student_SW\\HtmlFiles\\multiplewindows.html");
		System.out.println("application opend");
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(3000);
		System.out.println("wind1 opend");
		driver.findElement(By.id("btn2")).click();
		System.out.println("wind2 opend");
		ArrayList<String>wind=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wind.get(0));
		Thread.sleep(3000);
		driver.quit();
		System.out.println("close all tabs");

	}

}
