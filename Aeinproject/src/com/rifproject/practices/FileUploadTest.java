package com.rifproject.practices;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	

	public static void main(String[] args) throws IOException    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();

	driver.findElement(By.id("wdgt-file-upload")).click();
	
	
	Runtime.getRuntime().exec("C:\\Users\\18603\\Desktop\\fileupload.exe");
	//driver.findElement(By.id("wdgt-file-upload")).sendKeys("D:\\practice.docx");
	}

}