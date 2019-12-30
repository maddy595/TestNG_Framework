package com.test.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {
	
	static FileInputStream fis;
	static XSSFSheet sheet ;
	static XSSFWorkbook wb;
	
	public TestUtil(String SheetName) throws Exception {
		
		System.out.println(System.getProperty("user.dir"));   //C:\Users\madhav.gaikwad\eclipse-workspace\TestNG_Framework
		fis = new FileInputStream(new File (System.getProperty("user.dir")+"\\testdata.xlsx"));
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(SheetName);
	}
	

	
	public static void main(String [] args) throws Exception {
		
		TestUtil test = new TestUtil("Sheet1");
		getrowCount();
		getCellDataString("Sheet1", 0, 2);
	}
	
	public static int getrowCount() throws Exception {
		
		int row = sheet.getPhysicalNumberOfRows();
	//	System.out.println(row);
		return row;
		}

	public static String getCellDataString(String SheetName, int row , int column) throws Exception {
		

		String s = sheet.getRow(row).getCell(column).getStringCellValue();
		return s;
	}
	
	public static void getCellDataNumber(String SheetName, int row , int column) throws Exception {
		

		double s = sheet.getRow(row).getCell(column).getNumericCellValue();
		System.out.println(s);
	}
	
	public static int getColumnCount() throws Exception {
		
		int Columncount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		//System.out.println(Columncount);
		return Columncount;
		}
	
}
