package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1. Set the Path for the Workbook
		
		XSSFWorkbook wb=new XSSFWorkbook("./DataSheet/CreateLead.xlsx");
		
		// 2. Get into Sheet
		
		XSSFSheet sheet=wb.getSheetAt(0); // Using index
		
		//XSSFSheet sheet1=wb.getSheet("Sheet1"); // using sheet name
		// 3. get into the row 
		int rowCount=sheet.getLastRowNum();
		System.out.println("Row Count:" + rowCount); // it will exclude header value
		
		int rowCount1=sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count with Header: " +rowCount1);
		int cellCount=sheet.getRow(1).getLastCellNum(); // getting cell count from first row
		System.out.println("Cell Count: " + cellCount);
		String FRowThCol=sheet.getRow(1).getCell(3).getStringCellValue();	// getting value of first row third column
		System.out.println("First Row Third Column has: " + FRowThCol);
		
		// 4. get into the column
		// displaying all the data
		for (int i =1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
				
			}
			
		}
		wb.close();
		
		
		
	}

}
