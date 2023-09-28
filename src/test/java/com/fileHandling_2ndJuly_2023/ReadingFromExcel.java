package com.fileHandling_2ndJuly_2023;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ReadingFromExcel{
	public static WebDriver driver;
	public static Object[][] RedData;
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;
	
@DataProvider (name = "Red")
public static Object[][] redIffLogindata() throws Exception{
	
	RedData = ReadingFromExcel.redIffLogin("login");
	return RedData;
}
	
	
	public static Object[][] redIffLogin(String sheetName) throws Exception {
		 fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\fileHandling_2ndJuly_2023\\LoginData.xlsx");
			
		workbook = new XSSFWorkbook (fis);
		
		sheet =workbook.getSheet(sheetName); 
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object[][] o = new Object[rows][cols];
		
		for (int i = 0; i<rows; i++) {
		row = sheet.getRow(i+1);
			
			for (int j = 0; j<cols; j++) {
				cell = row.getCell(j);
				
				org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
				
				switch (cellType) {
				case STRING:
					o[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					o[i][j] = Integer.toString((int)cell.getNumericCellValue());
					break;
					
				case BOOLEAN: 
					o[i][j] = cell.getBooleanCellValue();
					break;
			
				default:
					break;
					}}}
	
		return o;
}}
