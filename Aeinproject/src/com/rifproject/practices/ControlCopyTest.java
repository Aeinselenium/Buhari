package com.rifproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ControlCopyTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\18603\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		driver.manage().window().maximize();
		
		/*
		 * driver.findElement(By.id("xX4UFf")).sendKeys("Aein");
		 * driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
		 * driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
		 * driver.findElement(By.id("mSoczb")).sendKeys(Keys.CONTROL+"v");
		 */
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.id("NqEkZd")).sendKeys("hello");
		
		driver.findElement(By.xpath("//*[@id=\'s1zaZb\']/div[5]/div[9]/div[2]/input[2]")).click();
		
		
	}
	
}