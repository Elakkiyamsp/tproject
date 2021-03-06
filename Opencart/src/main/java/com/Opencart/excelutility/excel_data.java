package com.Opencart.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_data 
{
	public int row_count() throws IOException
	{
		FileInputStream fil=new FileInputStream(new File("src/test/resources/Testdata/Opencart_data.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Testdata");
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		
		return rowcount;
	}
	public String excel_emailid(int x) throws IOException
	{
		FileInputStream fil=new FileInputStream(new File("src/test/resources/Testdata/Opencart_data.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Testdata");
		
		XSSFRow row=sheet.getRow(x);
    	XSSFCell cell=row.getCell(0);
    	String un=cell.getStringCellValue();
    	
    	return un;
	}
	
	public String excel_password(int y) throws IOException
	{
		FileInputStream fil=new FileInputStream(new File("src/test/resources/Testdata/Opencart_data.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Testdata");
		
		XSSFRow row=sheet.getRow(y);
		XSSFCell cell1=row.getCell(1);
    	String pwd=cell1.getStringCellValue();
    	
    	return pwd;
	}


}
