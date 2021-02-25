package com.rifproject.method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SIMTest {
	ChromeDriver driver;
	String res;
	String username="admin";
	String password="master";
	//app launch
	public String  applaunch(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		//validation

	if (driver.findElement(By.id("username")) .isDisplayed()) {
		//System.out.println("pass");
		res="pass";
	} else {
		//System.out.println("fail");
		res="fail";

	}
	return res;	
	}
	
	//app login
	public String  applogin(String username, String password) {
		driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("master");
	driver.findElement(By.id("btnsubmit")).click();
	//validation
	if (driver.findElement(By.xpath("//*[@id='mi_a_purchases']/a")).isDisplayed())
	{
		res="Pass";
	} else
	{
		res="Fail";

	}
	return res;}
	
	
/*
 * // app logout public void applogout(){
 * 
 * driver.findElement(By.id("logout")).click(); if
 * (driver.findElement(By.id("username")).isDisplayed()) { res="Pass";
 * 
 * } else { res="Fail"; }
 * 
 * } //app close public void appclose() { driver.close(); }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * //validation
 */	
	
	public static void main(String[] args) {
		SIMTest app=new SIMTest();
		String results=app.applaunch("http://sim.qamerits.com/login.php");
		app.applogin("admin"," master");
//app.applogout();//
//app.appclose();//
		
	
}
}
  

