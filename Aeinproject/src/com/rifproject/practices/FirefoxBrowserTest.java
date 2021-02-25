package com.rifproject.practices;



import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\18603\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
	
	
	}

}
