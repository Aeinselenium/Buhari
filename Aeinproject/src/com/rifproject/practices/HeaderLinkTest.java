package com.rifproject.practices;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinkTest {

	public static void main(String[] args) 
	{
			
System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

			driver.get("Http://amazon.in");	
			
			driver.manage().window().maximize();
			
	WebElement  header=driver.findElement(By.id("nav-xshop"));
	
	//find all the links under the header section
	
	
  List<WebElement> headerlink=header.findElements(By.tagName("a"));
   
System.out.println(headerlink.size());

for (WebElement elements:headerlink) {
	
	
System.out.println(elements.getText());

	if (elements.getText().equals("Mobiles")) {
		
		elements.click();
		
	}
}
	
	

	
	
	
			
			
			
	}

}
