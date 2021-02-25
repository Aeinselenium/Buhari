package com.rifproject.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

			driver.get("https://jqueryui.com/droppable/");	
			
			driver.manage().window().maximize();
			
			
			 
			
			//  List<WebElement> frames=driver.findElements(By.tagName("iframe"));
			  
			 // System.out.println(frames.size());
			  
			  
			//  driver.switchTo().frame(0);
			  
				
				 // driver.switchTo().frame(driver.findElement(By.xpath( "//*[@id='content']/iframe")));
				  WebElement fr=driver.findElement(By.xpath("//*[@id='content']/iframe"));
				  driver.switchTo().frame(fr);
				 
			  WebElement drg=driver.findElement(By.id("droppable"));
			  
			  WebElement drp=driver.findElement(By.id("draggable"));
			  Actions dad=new Actions(driver);
			  
			  
			  dad.dragAndDrop(drp, drg).build().perform();
			  driver.switchTo().defaultContent();
			  System.out.println(driver.findElement(By.xpath("//*[@id=\'content\']/h1")).getText());
			 

	}

}
