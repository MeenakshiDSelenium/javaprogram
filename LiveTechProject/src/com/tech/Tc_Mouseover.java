package com.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Tc_Mouseover {
	public static String un="admin";
	public static String pw="admin";

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://localhost/orangehrm/orangehrm-2.6/login.php");
		System.out.println("Application opened");
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("title matched TO :"+driver.getTitle());
		}
		else {
			System.out.println("title not matched TO :"+driver.getTitle());
		}
		driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys(un);
		System.out.println("entered userName");
		driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys(pw);
		System.out.println("passWord entered");
		driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[4]/td/input")).click();
		System.out.println("clicked logout button open orangeHRM page");
		Thread.sleep(3000);
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("title matched to :"+driver.getTitle());
		}
		else {
			System.out.println("title not matched to :"+driver.getTitle());
		}
		//mouseover on Admin
		WebElement element=driver.findElement(By.linkText("Admin"));
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		System.out.println("admin mian menu navigated");
		Thread.sleep(3000);
		//mouse over on data import/export
		WebElement element1=driver.findElement(By.linkText("Data Import/Export"));
		Actions ac=new Actions(driver);
		a.moveToElement(element1).perform();
		System.out.println("Data Import/Export navigated");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Export")).click();
		System.out.println("clicked Export");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("back to home page");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("close browser");
		
	}

	
}
