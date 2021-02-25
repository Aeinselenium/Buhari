package com.rif.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.rifproject.method.PrimusBank;
import com.rifproject.practices.BranchCreationTest;
import com.rifproject.practices.PrimusBankTest;

public class DataDrivenTest {

	public static void main(String[] args) throws Exception {
		// branch creation with multiple sets of data
		
		
		
	PrimusBank app=new PrimusBank();
	app.applaunch("http://www.primusbank.qedgetech.com/");
	app.applogin("Admin"," Admin");
	File srcfile=new File("C:\\Users\\18603\\Desktop\\selenium excel.xlsx");

FileInputStream fis=new FileInputStream(srcfile);
XSSFWorkbook  wb=new XSSFWorkbook(fis);
XSSFSheet  ws=wb.getSheet("Sample");
int rcnt=ws.getLastRowNum();
for (int i = 1; i <rcnt; i++) {

	String bname=ws.getRow(i).getCell(0).getStringCellValue();
	
	String add1=ws.getRow(i).getCell(1).getStringCellValue();
	System.out.println("Reading:"+i+"set of data:"+bname+"---"+add1);
	String results=	app.branchcreation(bname, add1);
	ws.getRow(i).createCell(2).setCellValue(results);
	FileOutputStream fos=new FileOutputStream(srcfile);
	wb.write(fos);
	

	

	
	}
wb.close();
app.applogout();
app.appclose();
	}

}
