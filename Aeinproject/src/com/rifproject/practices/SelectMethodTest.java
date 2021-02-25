package com.rifproject.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodTest {

	public static void main(String[] args) {
System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

			driver.get("Http://amazon.in");	
			
			driver.manage().window().maximize();
			
	WebElement  drop=driver.findElement(By.id("searchDropdownBox"));
	
	Select   sl=new  Select(drop);
	
	
	sl.selectByIndex(23);
	sl.selectByVisibleText("Music");
	sl.selectByValue("search-alias=alexa-skills");
	
	List<WebElement> droplist = sl.getOptions();
	
	System.out.println(droplist.size());
	
	for (WebElement element : droplist) {
		System.out.println(element.getText());
		
		sl.selectByIndex(23);
		System.out.println(sl.getFirstSelectedOption().getText());
		
		System.out.println(sl.isMultiple());
		
		sl.selectByIndex(23);
		
		List<WebElement> slitem=sl.getAllSelectedOptions();
		
		System.out.println(slitem.size());
		
		for (WebElement element1 : slitem) {
			
			System.out.println(element1.getText());
		}
		
		
		
		
		
		
	}

			
	}
}
