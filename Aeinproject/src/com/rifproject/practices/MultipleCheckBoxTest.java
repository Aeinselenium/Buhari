package com.rifproject.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MultipleCheckBoxTest {
	
	
	public static void main(String[] args) {
		
System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

				
				driver.get("http://echoecho.com/htmlforms09.htm");	
				
				
			driver.manage().window().maximize();
WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
List<WebElement>  checklist=table.findElements(By.tagName("input"));                          
            
            System.out.println(checklist.size());
            for (int i = 0; i < checklist.size(); i++)
            {
            //	checklist.get(i).click();
            	//capture all the names and status
            	
            	System.out.println(checklist.get(i).getAttribute("Value")+"-----"+checklist.get(i).getAttribute("Checked"));
            	
            		//specific checkbox
            	
					/*
					 * if (checklist.get(i).getAttribute("value").equals("Cheese")) {
					 * checklist.get(i).click();
					 * 
					 * }
					 */
            	
            	
            	checklist.get(i).click();
            	System.out.println("click on:    "+checklist.get(i).getAttribute("value"));
            	for (int j = 0; j < checklist.size(); j++) {
					System.out.println(checklist.get(j).getAttribute("value")+"_____"+checklist.get(j).getAttribute("Checked"));
					
					
				}
					
				
            	System.out.println("###############");
            	
					
				
            
            						
            	            	
            	            	
            					}
					
				}

	}

            	

			 
	
	

