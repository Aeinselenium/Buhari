package com.rifproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTest {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

			driver.get("Http://shadi.com");	
			
			driver.manage().window().maximize();
			
			//Month
			
			Select  month=new  Select(driver.findElement(By.id("dob_m")));
			month.selectByVisibleText("Mar");
			
			//day
			
			Select  day=new Select(driver.findElement(By.id("dob_d")));
			day.selectByIndex(6);
			
			//year
			
			Select year=new Select(driver.findElement(By.id("dob_y")));
			year.selectByValue("1999");
			
			driver.findElement(By.id("dob_m")).sendKeys("Mar");
					

	}

}
