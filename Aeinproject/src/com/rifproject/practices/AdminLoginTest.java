package com.rifproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLoginTest {

	public static void main(String[] args) {
		String username="admin";
		String password="master";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://sim.qamerits.com/login.php");
		driver.manage().window().maximize();
		
		
		  driver.findElement(By.id("username")).clear();
		  driver.findElement(By.id("username")).sendKeys(username);
		  driver.findElement(By.id("password")).clear();
		  driver.findElement(By.id("password")).sendKeys(password);
		  driver.findElement(By.id("btnsubmit")).click();
		  driver.findElement(By.id("logout")).click();
		  
		  driver.close();
		 

if (driver.findElement(By.id("username")) .isDisplayed()) {
	System.out.println("pass");
} else {
	System.out.println("fail");

}




	}
	
	
	
	

}
