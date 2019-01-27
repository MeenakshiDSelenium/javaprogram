package com.meena;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc_delete {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://localhost/orangehrm/orangehrm-2.6/login.php");
		System.out.println("Application opened");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("admin");
		System.out.println("entered userName");
		driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
		System.out.println("passWord entered");
		driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[4]/td/input")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		Select drpdwn=new Select(driver.findElement(By.name("loc_code")));
		drpdwn.selectByIndex(1);
		
		

	}

}
