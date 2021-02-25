package com.rifproject.practices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleRadioButtons {

	public static void main(String[] args ) {
		
			
System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

				
				driver.get("http://www.echoecho.com/htmlforms10.htm");	
				
				
			driver.manage().window().maximize();
			
WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
List<WebElement>  radiolist=table.findElements(By.tagName("input"));                          
            
            System.out.println(radiolist.size());
            
            for (int i = 0; i < radiolist.size(); i++) {
            	System.out.println(radiolist.get(i).getAttribute("value")+"----"+radiolist.get(i).getAttribute("Checked"));
            	
            	if (radiolist.get(i).getAttribute("value").equals("Beer")) {
            		radiolist.get(i).click();
            
            		radiolist.get(i).click();
            		System.out.println("click on :"+radiolist.get(i).getAttribute("value"));
            		for (int j = 0; j <radiolist.size(); j++) {
            			System.out.println(radiolist.get(j).getAttribute("value")+"----"+radiolist.get(j).getAttribute("checked"));
						
					}
            		
            		
            		System.out.println("##########");
				}
            
           
          
            
            
				
			}
            
            
            
				
			
            
            
            
            	
            	
			
		
		
		
		
		
		
		
		
		
            	
            }		
		

}
