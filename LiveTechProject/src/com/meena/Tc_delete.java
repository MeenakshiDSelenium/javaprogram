package com.meena;




import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_delete {

	//private static String value;

	

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
        
        WebElement table=driver.findElement(By.xpath("//table[@class='data-table']"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(int i=3;i<rows.size();i++) {
			driver.findElement(By.xpath("//*[@id=\'standardView\']/table/tbody/tr["+i+"]/td[1]/input")).click();
			
			
		/*List<WebElement> tbody=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(tbody.size());
		for(int i=0;i<tbody.size()-2;i++) {
			tbody.get(i).click();*/
			
			
			//driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[2]")).click();
			//System.out.println("deleted successfully");
			
		}}}	
			
       /* WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='0002']"));
        oCheckBox.click();*/
        
		
		//driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[2]")).click();
		//System.out.println("deleted successfully");
        
        //using this selected all checkboxs
        /*List<WebElement> ddc=driver.findElements(By.xpath("//input[@type='checkbox']"));
        
        System.out.println(ddc.size());
        for(WebElement el:ddc) {
        	if(!el.isSelected()) {
        	el.click();
        }
        }*/
        
	

	
	
	


