package com.rifproject.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertTest {

	public static void main(String[] args) throws Exception {
		 System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://ksrtc.in/oprs-web/guest/home.do");	
					
					
				driver.manage().window().maximize();
Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='corover-close-btn']")).click();
	
					
					
	Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\'bookingsForm\']/div/div/div[2]/div[3]/button")).click();
				Thread.sleep(2000);
				
				Alert al=driver.switchTo().alert();
				
				System.out.println(al.getText());
				Thread.sleep(2000);
				
				al.accept();
				//al.dismiss();
				//al.getText();
			//	al.sendKeys(null);
				
		
	}
	}