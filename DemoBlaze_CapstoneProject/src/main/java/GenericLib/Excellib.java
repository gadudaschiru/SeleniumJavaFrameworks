package GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellib {

	public String getStringExcelData(String sheetName, int rowNum, int cellNum) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.filepath);

		// Open the workbook in a read mode
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// get the sheet in control
		XSSFSheet sheet = workbook.getSheet(sheetName);

		// get the control of the row
		XSSFRow row = sheet.getRow(rowNum);

		String data = row.getCell(cellNum).getStringCellValue();

		return data;

	}

	public double getNumericExcelData(String sheetName, int rowNum, int cellNum) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.filepath);

		// Open the workbook in a read mode
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// get the sheet in control
		XSSFSheet sheet = workbook.getSheet(sheetName);

		// get the control of the row
		XSSFRow row = sheet.getRow(rowNum);

		double data = row.getCell(cellNum).getNumericCellValue();

		return data;

	}

	public void setExcelData(String sheetName, int rowNum, int cellNum, String data) throws Exception {

		FileInputStream fis = new FileInputStream(Constants.filepath);

		// Open the workbook in a read mode
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// get the sheet in control
		XSSFSheet sheet = workbook.getSheet(sheetName);

		// get the control of the row
		XSSFRow row = sheet.getRow(rowNum);

		// create the cell
		XSSFCell cell = row.createCell(cellNum);

		// write the data to the cell using java API - FileOutPutStream

		FileOutputStream fos = new FileOutputStream(Constants.filepath);
		cell.setCellValue(data);

		workbook.write(fos);

		// It is must to close the workbook
		workbook.close();

	}

}
