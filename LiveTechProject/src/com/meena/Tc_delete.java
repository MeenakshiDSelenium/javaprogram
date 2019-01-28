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
		//comm
		Select drpdwn=new Select(driver.findElement(By.name("loc_code")));
		drpdwn.selectByIndex(1);
		System.out.println("selected empID");
		driver.findElement(By.name("loc_name")).sendKeys("0006");
		System.out.println("search emp id");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		System.out.println("clicked search button");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr/td[1]/input")).click();
		System.out.println("clicked checkbox");
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]")).click();
		System.out.println("clicked delete button");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logiut completed");
		driver.close();
	
		

	}

}
