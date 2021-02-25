package com.rifproject.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) {
		 System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com/");	
					
					
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//*[@id='root']/div[1]/div/ul[1]/li[2]/a/div")).click();
				
				Set<String> windows=driver.getWindowHandles();
				
				/*for (String child : windows) {
					System.out.println(child);
					
					driver.switchTo().window(child);
					System.out.println(driver.getTitle());
					driver.close();
					
					if (!driver.switchTo().equals("LNT")) {
						driver.close();*/
						
						List<String> tabs=new ArrayList(windows);
						
						driver.switchTo().window(tabs.get(0));
						System.out.println(driver.getTitle());
						driver.close();
						
						
						
					}
					
				
	}


