package com.aein.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminLoginTest {
	@Test
	
	public void adminlogin() {
		String username="admin";
		String password="master";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://sim.qamerits.com/login.php");
		driver.manage().window().maximize();
		
		Assert.assertTrue(driver.findElement(By.id("username")).isDisplayed());
		  //driver.findElement(By.id("username")).clear();
			/*
			 * driver.findElement(By.id("username")).sendKeys(username);
			 * driver.findElement(By.id("password")).clear();
			 * driver.findElement(By.id("password")).sendKeys(password);
			 * driver.findElement(By.id("btnsubmit")).click();
			 */
		
	}

}
