package com.test.util;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	

	@DataProvider(name="testData")
	public static Object[][] getData() throws Exception {
		
		Object [][] data = testData("Sheet1");
		return data;
		
	}
	
	
	
	public static Object[][] testData(String SheetName) throws Exception {
		
		TestUtil excel = new TestUtil(SheetName);
		int rowcount = excel.getrowCount();
		System.out.println(rowcount);
		int columncount = excel.getColumnCount();
		System.out.println(columncount);
		
		Object [][] data = new Object[rowcount-1][columncount];
	
		for(int i=1; i<rowcount;i++) {
			for(int j=0; j<columncount;j++) {
				String CellData = excel.getCellDataString(SheetName, i, j);
				System.out.print(CellData +  "  |  ");
				data[i-1][j]=CellData;
			}
			System.out.println();
		}
		return data;
	}
}
