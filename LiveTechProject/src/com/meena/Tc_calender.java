package com.meena;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_calender {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//click on textbox so that datepicker will come
		driver.findElement(By.id("datepicker")).click();
		//click on next so that we will be in next month
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		/*datepicker is a table so navigate to each cell
		 if a particular cell matches value then it will select it 
		 */
		WebElement datew=driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> row=datew.findElements(By.tagName("tr"));
		List<WebElement> col=datew.findElements(By.tagName("td"));
		for(WebElement cell:col) {
			//selecting 24th date
			if(cell.getText().equals("24")) {
				cell.findElement(By.linkText("24")).click();
				Thread.sleep(5000);
				break;
				
			}
			
		}
		driver.quit();
		
		

	}

}
