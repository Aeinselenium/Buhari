package com.rif.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentTest {

	

	

	public static void main(String[] args) throws IOException {
		File srcfile=new File("C:\\Users\\18603\\Desktop\\selenium excel.xlsx");
		FileInputStream fis=new FileInputStream(srcfile);
		XSSFWorkbook  wb=new XSSFWorkbook(fis);
		XSSFSheet  ws=wb.getSheet("Sample");
		 
		 
String Celldata="";
for (int i = 0; i <=ws.getLastRowNum(); i++) {
	 if (ws.getRow(i).getCell(1).getCellType()==CellType.NUMERIC) {
			int data=( int)	ws.getRow(i).getCell(1).getNumericCellValue();
			
			 Celldata=String.valueOf(data);
	 }
			
	 else {
	Celldata=	ws.getRow(i).getCell(1).getStringCellValue();
	}
	 System.out.println(Celldata);
		}

		
	
	}

}


 