package com.rifproject.method;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank {
	
	

ChromeDriver driver;
	String res;
	String username="Admin";
	String password="Admin";
	//app launch
	public String  applaunch(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		//validation

	if (driver.findElement(By.id("txtuId")) .isDisplayed()) {
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
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
	//validation
	if (driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
	{
		res="Pass";
	} else
	{
		res="Fail";

	}
	return res;}
	
	//branch creation
	public String  branchcreation(String bname, String add1) throws Exception {
Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	driver.findElement(By.id("BtnNewBR")).click();
	driver.findElement(By.id("txtbName")).sendKeys("Aein56564");
	driver.findElement(By.id("txtAdd1")).sendKeys("Madhapur");
	driver.findElement(By.id("txtZip")).sendKeys("54545");
	Thread.sleep(2000);
	
	Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
	country.selectByIndex(1);
	Thread.sleep(2000);
	
	Select state=new Select(driver.findElement(By.id("lst_stateI")));
	state.selectByIndex(1);
	Thread.sleep(2000);
	
	Select city=new Select(driver.findElement(By.id("lst_cityI")));
	city.selectByIndex(1);
	Thread.sleep(2000);
	
	driver.findElement(By.id("btn_insert")).click();
	Thread.sleep(2000);
	
	  Alert al=driver.switchTo().alert();
	  
	  String msg=al.getText(); 
	  al.accept();
		
		  if(msg.contains("created Successfully")) {
		  // System.out.println("Pass");
		  res="pass";
		  } else if (msg.contains("Already Exist")) {
		  // System.out.println("Fail");
		  res="fail";
		  } else if (msg.contains("please fill")) {
		  //{ System.out.println("Warning"); }
		 res="warning";}
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		  return res;
	}
	

  public void applogout(){
  
  driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a/img")).
  click();
  
  if (driver.findElement(By.id("txtuId")).isDisplayed()) { res="Pass";
  
  }
  
  else { res="Fail"; }
  
  }
//app close
  public void appclose() { driver.close(); }
 
			

	
	
	
	
	//validation
	
	
	public static void main(String[] args) throws Exception {
		PrimusBank app=new PrimusBank();
		String results=app.applaunch("http://www.primusbank.qedgetech.com/");
		app.applogin("Admin"," Admin");
		app.branchcreation("Aein56564", "Madhapur");
app.applogout();
app.appclose();
	
	
}
}
