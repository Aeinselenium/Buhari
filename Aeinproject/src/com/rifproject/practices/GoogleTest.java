package com.rifproject.practices;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {

				
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");	
				
				
			driver.manage().window().maximize();

	}

}
