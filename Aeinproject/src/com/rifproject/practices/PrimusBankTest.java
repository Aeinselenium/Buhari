package com.rifproject.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimusBankTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a/img")).click();
		
		driver.close();
		
			

}
}