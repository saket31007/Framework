package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;  
	
	public ExcelDataProvider() throws Exception {
		
		String path = "C:\\Users\\NEURO\\eclipse-workspace\\Framework\\TestData\\Data.xlsx";
		
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		 wb =new XSSFWorkbook(fis);
		
	}
	public String getStringData(String sheetname , int row, int column) {
		
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}

}
