package com.rif.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilities {
	Workbook wb;
	public Utilities() throws Exception {
		FileInputStream fis=new FileInputStream("D:\\Selenium projects\\sim.project\\Aeinproject\\testinput\\excelsheet.xlsx");
		wb=WorkbookFactory.create(fis);
		
	}
	public int rowcount(String sheetname) {
		return wb.getSheet(sheetname).getLastRowNum();
	}
	public int colcount(String sheetname, int row) {
		return wb.getSheet(sheetname).getRow(row).getLastCellNum();
	}
	public String getdata(String sheetname,int row, int column) 
	
	{
		 String Stringdata = "";
		String data;
		if (wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==CellType.NUMERIC) {
		int celldata=(int)	wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			data=String.valueOf(celldata);
			
			
			
		}
		else {
			data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		return data;
	}
	public static void main(String[] args) throws Exception {
		Utilities excel=new Utilities();
		System.out.println(excel.rowcount("sheet1"));
		
		
		// System.out.println(excel.getdata("sheet1", 0, 0));
		// System.out.println(excel.getdata("sheet1", 0, 1));
		for (int i = 0; i <=excel.rowcount("sheet1"); i++) {
			System.out.println(excel.getdata("sheet1", i, 0));
		System.out.println(excel.getdata("sheet1", i, 1));
		}


	}
}
