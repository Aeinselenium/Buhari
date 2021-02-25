package com.rifproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) 
	{
System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

			driver.get("http://www.amazon.in/");	
			
			driver.manage().window().maximize();
			
		WebElement	signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions  mouse=new Actions(driver);
		mouse.moveToElement(signin).build().perform();
		
	driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]")).click();
			
			
			
	}

}
