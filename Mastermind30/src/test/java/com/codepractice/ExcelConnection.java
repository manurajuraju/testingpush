package com.codepractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelConnection {
	public static void main(String[]args) throws IllegalStateException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("./Excelfolder/Book1.xls");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("EXCEL4");
		String s=sh.getRow(1).createCell(1).getStringCellValue();
		System.out.println(s);
	}

}
