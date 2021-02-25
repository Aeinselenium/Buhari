package com.rifproject.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest
{
	public static void main(String[] args)
	{
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
ChromeDriver driver=new ChromeDriver();

	driver.get("Http://amazon.in");	
	
	driver.manage().window().maximize();
	
	 List<WebElement>    Link=driver.findElements(By.tagName("a"));
	 
	 System.out.println(Link.size());
	
	
}
}	
	
	
	
	

