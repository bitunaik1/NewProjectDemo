package PracticeQR;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcel {
public static void main(String[] args) throws Throwable{
	
	String path="./src/test/resources/Hardware Manager_TestCases.xlsx";
	
	
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Login");
	
	int totalRow= sheet.getLastRowNum();
	for (int i = 0; i < totalRow; i++) { //i=0
		int totalCell=sheet.getRow(i).getLastCellNum(); 
		for (int j = 0; j < totalCell; j++) {
			sheet = wb.getSheet("Total Count");
			String value = sheet.getRow(i).getCell(j).getStringCellValue();//value=0,1/0,2
			System.out.print(value+"   |");
			
			Thread.sleep(2000);
//			sheet = wb.getSheet("SetValue");
//			
//			sheet.createRow(i).createCell(j).setCellValue(value);
//			FileOutputStream fos = new FileOutputStream(path);//value=0row,1 column
//			wb.write(fos);
//			
		}
		System.out.println();
	}
	wb.close();
	System.out.println("Completed........................");
}
}
