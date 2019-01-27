package com.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orange {
	public static String un="admin";
	public static String pw="admin";

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open browser");
		driver.navigate().to("http://localhost/orangehrm/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		System.out.println("open application");
	
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println("maximized window");
		Thread.sleep(3000);
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("title matched");
		}
		else {
			System.out.println("title not matched");
		}
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(un);
		System.out.println("entered user Name");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pw);
		System.out.println("entered password");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		System.out.println("clicked login button");
		Thread.sleep(3000);
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("the title matched :"+driver.getTitle());
		}
		else {
			System.out.println("the title not matched to:"+driver.getTitle());
		}
		
		//mouse over on mainmenu
		WebElement element=driver.findElement(By.linkText("PIM"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("add employee form opend");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
		System.out.println("back to home");
		driver.quit();
		System.out.println("close browser");
		
		
		
		
		
		

	}

}
