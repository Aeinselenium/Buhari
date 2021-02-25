package com.rif.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingTest {

	public static void main(String[] args) throws Exception {
			File srcfile=new File("C:\\Users\\18603\\Desktop\\selenium excel.xlsx");
		FileInputStream fis=new FileInputStream(srcfile);
		XSSFWorkbook  wb=new XSSFWorkbook(fis);
		XSSFSheet  ws=wb.getSheet("Sample");
		
		ws.getRow(1).createCell(2).setCellValue("Eclipse");
		ws.getRow(2).createCell(2).setCellValue("Class");
FileOutputStream fos=new FileOutputStream(srcfile);
wb.write(fos);
wb.close();
	}

}
