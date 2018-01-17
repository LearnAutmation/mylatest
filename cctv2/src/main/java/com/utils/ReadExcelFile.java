package com.utils;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public Object[][] ExcelDataProvider(String sheet1,int row, int column) throws Exception {

		File src = new File("C://Users//22231//gitfinal//cctv2//locators.xlsx");

		System.out.println("reading file");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Get first sheet from the workbook
		XSSFSheet sheet = workbook.getSheet(sheet1);

		/*System.out.println(sheet.getRow(row).getCell(column).getStringCellValue());

		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		*/
		
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		// System.out.println(sheet.getLastRowNum() + "--------" +

		// sheet.getRow(0).getLastCellNum());

		for (int i = 0; i < sheet.getLastRowNum(); i++) {

			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {

				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();

				 System.out.println(data[i][k]);

			}

		}
		
		fis.close();
		workbook.close();		
		return data;

		
		

		
	}

	// return;
}
