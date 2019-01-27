package com.tech;

import java.io.FileInputStream;

import jxl.*;

public class Ex_excel {

	public static void main(String[] args)throws Exception {
		FileInputStream f1=new FileInputStream("E:\\Selenium_Student_SW\\ReadExcel.xls");
		Workbook wb=Workbook.getWorkbook(f1);
		Sheet s1=wb.getSheet(0);
		int rows=s1.getRows();   //to get row count
		System.out.println(rows);
		for(int i=1;i<rows;i++) {
			String EmpId=s1.getCell(0,i).getContents();
			String EmpName=s1.getCell(1,i).getContents();
			String Empsalary=s1.getCell(2,i).getContents();
			String Empnum=s1.getCell(3,i).getContents();
			System.out.println(EmpId);
			System.out.println(EmpName);
			System.out.println(Empsalary);
			System.out.println(Empnum);
		}
		

	}

}
