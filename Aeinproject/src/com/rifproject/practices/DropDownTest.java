package com.rifproject.practices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownTest {

	public static void main(String[] args) {
		
	
	System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();

		driver.get("Http://shadi.com");	
		
		driver.manage().window().maximize();
		
	WebElement drop=driver.findElement(By.id("dob_m"));
	
List<WebElement>  droplist=	drop.findElements(By.tagName("option"));

System.out.println(droplist.size());

for (int i = 0; i < droplist.size(); i++) {
	System.out.println(droplist.get(i).getText());
	
	droplist.get(i).click();
	
	if (droplist.get(i).getText().equals("Mar")) {
		droplist.get(i).click();
		
		if (droplist.get(i).isSelected()) {
			
			System.out.println(droplist.get(i).getText()+": is selected ");
			
			
			} else {
				System.out.println(droplist.get(i).getText()+": is selected ");

			}
			
		}
		
	}
	
}


		
		
		
		

}
