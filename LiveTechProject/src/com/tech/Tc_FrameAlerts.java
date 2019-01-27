package com.tech;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertTrue;


public class Tc_FrameAlerts {
	public static String un="admin";
	public static String pw="admin";

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("open browser");
		driver.navigate().to("http://localhost/orangehrm/orangehrm-2.6/login.php");
		System.out.println("open Application");
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Homepage title mached");
		}
		else {
			System.out.println("HomePage title not matched to :"+driver.getTitle());
		}
		Thread.sleep(5000);//verify text
		assertTrue(driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]")).getText().matches("Login Name :"));
		System.out.println("user Name leble verifyed");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys(un);
		System.out.println("entered userName");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);//Alert
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys(pw);
		System.out.println("entered passWord");
		Thread.sleep(3000);
		driver.findElement(By.name("clear")).click();
		System.out.println("clear all fields");
		driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("admin");
		System.out.println("entered User Name");
		driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
		System.out.println("entered Pass Word");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("title mached");
		}
		else {
			System.out.println("title not matched TO :"+driver.getTitle());
		}
		Thread.sleep(2000);//mousover on pim main menu
		WebElement element=driver.findElement(By.linkText("PIM"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		System.out.println("navigated pim");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("clicked on subMenu");
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");//selecting the frames
		driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("Suresh");
		System.out.println("entered lastName");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("Selenium");
		System.out.println("entered firstName");
		//to retrive the data from empid textBox
		String empID=driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
		System.out.println("Employee ID :"+empID);
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("click on save button");
		driver.switchTo().defaultContent();//exit from frame
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("back to Home");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("close browser");
		
		
		
		

	}

}
