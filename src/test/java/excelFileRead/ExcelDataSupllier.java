package excelFileRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupllier {

	@DataProvider(name="loginData")
	public String[][] getData() throws Exception {
		
		File excelFile = new File("C:\\Users\\admin12\\eclipse-workspace\\MavenTestNGPractice\\src\\test\\java\\excelFileRead\\file.xlsx");		
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[noOfRows-1][noOfColumns];
		for (int i = 0; i < noOfRows-1; i++) { 
			
			for (int j = 0; j < noOfColumns; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] =  df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}		
		return data;
	}
	
	@DataProvider(name="login")
	public String[][] passDataToMethod() throws Exception
	{
		File excelsheet = new File("C:\\Users\\admin12\\eclipse-workspace\\MavenTestNGPractice\\src\\test\\java\\excelFileRead\\file.xlsx");
		
		FileInputStream fis = new FileInputStream(excelsheet);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");		
		
		int noOfRows = sheet.getPhysicalNumberOfRows();		
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[noOfRows-1][noOfColumns];
		
		for(int i = 0 ; i<noOfRows-1; i++)
		{
			for(int j = 0; j < noOfColumns ;j++)
			{
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}				
		
		return data;
	}
}