package GenricLib;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {

	File filepath = new File("D:\\Eclipse Workspace\\Automation\\TestData\\TestData.xlsx");

	public String getExcelData(String sheetName, int rowNum, int colNum) throws Exception {

		FileInputStream fis = new FileInputStream(filepath);

		// Open work book in a readable format
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// get the control of the sheet
		XSSFSheet sheet = workbook.getSheet(sheetName);

		// get the control of First Row
		XSSFRow row = sheet.getRow(rowNum);

		// get the data from cell of the row
		String data = row.getCell(colNum).getStringCellValue();
		System.out.println("Data from excel is " + data);
		return data;
	}

	public void setExcelData(String sheetName, int rowNum, int colNum, String string) throws Exception {

		FileInputStream fis = new FileInputStream(filepath);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Get the control of the Sheet.

		XSSFSheet sheet = workbook.getSheet(sheetName);

		// Get the control of first row.

		XSSFRow row = sheet.getRow(rowNum);

		XSSFCell cell = row.createCell(colNum);

		FileOutputStream fos = new FileOutputStream(filepath);

		cell.setCellValue(string);

		workbook.write(fos);

		workbook.close();
	}
}
