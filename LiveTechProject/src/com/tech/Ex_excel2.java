package com.tech;

import java.io.FileInputStream;

import jxl.*;

public class Ex_excel2 {

	public static void main(String[] args)throws Exception {
		FileInputStream f1=new FileInputStream("E:\\Selenium_Student_SW\\ReadExcel.xls");
		Workbook wb=Workbook.getWorkbook(f1);
		Sheet s1=wb.getSheet(0);
		System.out.println(s1.getName());
		int i=1;  //to get dat from particular row
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
