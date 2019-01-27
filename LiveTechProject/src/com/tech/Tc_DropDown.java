package com.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc_DropDown {

	public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("E:\\Selenium_Student_SW\\HtmlFiles\\dropdownNavigate.html");
	System.out.println("open application");
	//selecting single value from dropdown
	Select drpdwn=new Select(driver.findElement(By.name("OptWeb")));
    drpdwn.selectByVisibleText("Google");
    System.out.println("visible text is google");
    driver.findElement(By.xpath("/html/body/form/input")).click();
    Thread.sleep(4000);
    System.out.println("click on Go buttpn");
    System.out.println(driver.getTitle());
    System.out.println("printed title");
    Thread.sleep(3000);
    driver.navigate().back();
    Thread.sleep(5000);
   // selecting multipul value from dropdown
    driver.navigate().to("E:\\Selenium_Student_SW\\HtmlFiles\\multiselectdropdown.html");
    Select lstbox=new Select(driver.findElement(By.id("tools")));
    lstbox.selectByVisibleText("Selenium IDE");
    System.out.println("selected is-Selenium IDE");
    lstbox.selectByIndex(1);
    System.out.println("selected is-Selenium RC");
    Thread.sleep(3000);
   // driver.close();
    
	

	}

}
