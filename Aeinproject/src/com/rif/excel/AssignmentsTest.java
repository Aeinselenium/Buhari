package com.rif.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentsTest {

	public static void main(String[] args) throws Exception {
		
			File srcfile=new File("C:\\Users\\18603\\Desktop\\selenium excel.xlsx");
	FileInputStream fis=new FileInputStream(srcfile);
	XSSFWorkbook  wb=new XSSFWorkbook(fis);
	XSSFSheet  ws=wb.getSheet("Sample");
	String Celldata="";
	
		 if (ws.getRow(0).getCell(1).getCellType()==CellType.NUMERIC) {
				int data=( int)	ws.getRow(0).getCell(1).getNumericCellValue();
				
				 Celldata=String.valueOf(data);
		 }
		 System.out.println(Celldata);
				
		 
			}
	}


