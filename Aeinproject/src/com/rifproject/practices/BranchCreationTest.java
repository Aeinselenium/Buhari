package com.rifproject.practices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class BranchCreationTest {

	public static void main(String[] args, String srcfile, String msg, Object app, Date results) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\18603\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		File srcfile1=new File("C:\\Users\\18603\\Desktop\\selenium excel.xlsx");

FileInputStream fis=new FileInputStream(srcfile1);
XSSFWorkbook  wb=new XSSFWorkbook(fis);
XSSFSheet  ws=wb.getSheet("Sample");
int rcnt=ws.getLastRowNum();
for (int i= 1; i<=rcnt; i++) {
	
	String bname=ws.getRow(i).getCell(0).getStringCellValue();
	
	String add1=ws.getRow(i).getCell(1).getStringCellValue();
	System.out.println("Reading:"+i+"set of data:"+bname+"---"+add1);
	
	
	ws.getRow(i).createCell(2).setCellValue(results);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(bname);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
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
		  
		  String msg1=al.getText(); 
		  al.accept();
			
			  if(msg1.contains("created Successfully")) {
			  //{ System.out.println("Pass");
				  ws.getRow(i).createCell(2).setCellValue("Pass");
			  
			  } else
				  if (msg1.contains("Already Exist")) { 
				  //System.out.println("Fail");
				  ws.getRow(i).createCell(2).setCellValue("Fail");
			  }
			   
			  else
				  if (msg.contains("please fill")) {
				  //System.out.println("Warning"); 
			 ws.getRow(i).createCell(2).setCellValue("Warning");
			  }
			  
				
			  FileOutputStream fos=new FileOutputStream(srcfile1);
				wb.write(fos);
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
				 
				  
			
}
				  
	wb.close();
	
		  driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr/td[3]/a/img")).click(); 
	  
		  
				  
				  driver.close();
				  
				
				
}


		
	}	
	

		
	


