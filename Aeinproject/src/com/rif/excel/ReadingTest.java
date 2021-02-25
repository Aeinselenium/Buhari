package com.rif.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest {

	public static void main(String[] args) throws Exception {
		File srcfile=new File("C:\\Users\\18603\\Desktop\\selenium excel.xlsx");
FileInputStream fis=new FileInputStream(srcfile);
XSSFWorkbook  wb=new XSSFWorkbook(fis);
XSSFSheet  ws=wb.getSheet("Sample");

  String data=ws.getRow(0).getCell(0).getStringCellValue();
  
  String data1=ws.getRow(0).getCell(1).getStringCellValue();
  
  
  System.out.println(data+"------"+data1);
 

/*int rcnt=ws.getLastRowNum();
for (int i = 0; i <=rcnt; i++) {
	String data=ws.getRow(i).getCell(0).getStringCellValue();

	String data1=ws.getRow(i).getCell(1).getStringCellValue();


	System.out.println(data+"------"+data1);
	*/
//}
}






	}
