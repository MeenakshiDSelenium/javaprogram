package com.tech;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/
public class Ex_excel1 {

	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("E:\\Selenium_Student_SW\\WriteData.xlsx‪");
		XSSFWorkbook wobo=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wobo.getSheet("test");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("befor updating cell data"+sheet.getRow(2).getCell(1));
		//write the data to excel file
		XSSFCell cell=sheet.getRow(2).getCell(1);
		cell.setCellValue("Test123");
      //  fis.close();
		
		
		FileOutputStream fileOut=new FileOutputStream("E:\\Selenium_Student_SW\\WriteData.xlsx");
		wobo.write(fileOut);
		System.out.println("updated data after write is done"+cell.getStringCellValue());
		
		fileOut.close();
		
	

	}

}
