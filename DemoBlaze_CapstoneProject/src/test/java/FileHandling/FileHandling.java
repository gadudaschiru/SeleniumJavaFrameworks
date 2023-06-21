package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling {

	public static void getexcelData() throws Exception {
		// Step 1: get the path of the file
		File filepath = new File("C:\\Users\\USER\\Desktop\\New folder\\DemoBlaze_Automation\\TestData\\TestData.xlsx");

		// Step 2: get the file in readable format
		FileInputStream fis = new FileInputStream(filepath);

		// Step 3: Open workbook in read mode or get the control of it.
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// step 4: get the control of sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// step 5: get the control of row
		XSSFRow row = sheet.getRow(1);

		String url = row.getCell(2).getStringCellValue();
		String username = row.getCell(3).getStringCellValue();
		String password = row.getCell(4).getStringCellValue();

		System.out.println("Url = " + url);
		System.out.println("Username = " + username);
		System.out.println("Password = " + password);

	}

	public static void setExcelData() throws Exception {

		// Step 1: get the path of the file
		File filepath = new File("..\\May15thAutomation\\TestData\\TestData.xlsx");

		// Step 2: get the file in readable format
		FileInputStream fis = new FileInputStream(filepath);

		// Step 3: Open workbook in read mode or get the control of it.
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// step 4: get the control of sheet
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// step 5: get the control of the row
		XSSFRow row = sheet.getRow(1);

		// step 6: create the cell
		XSSFCell cell = row.createCell(5);

		// step 7: create an output steam to put the data in excel using java API
		FileOutputStream fos = new FileOutputStream(filepath);

		// Step 8: set the value in cell - in the virtual copy or object of excel
		cell.setCellValue("ORDR987234");

		// step 9: submerge the object into the excel sheet
		workbook.write(fos);

		// step 10: close the workbook
		workbook.close();

		System.out.println("Data has been set to the excel sheet --> please check");
	}

	// 12 hrs - 3873
	public static void main(String[] args) throws Exception {
		getexcelData();
		setExcelData();
	}

}
