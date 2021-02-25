package com.rifproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClickTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\18603\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		
		WebElement  gmail=driver.findElement(By.linkText("Gmail"));
		Actions right=new Actions(driver);
		right.contextClick(gmail).sendKeys("T").build().perform();
		
		right.contextClick(gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	

	}

}
