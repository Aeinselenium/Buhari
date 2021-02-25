package com.aein.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PrimusBnak {
	ChromeDriver driver;
	@BeforeSuite
	public void applaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
	}
	@BeforeTest
	public void applogin() {

		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	@AfterTest
public void applogou() {
		driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a/img")).click();
		
	}
	@AfterSuite
	public void appclose() {
		driver.close();
	}
}
