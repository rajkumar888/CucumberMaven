package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws Exception 
	{
		File src = new File("C:\\Driver\\TestDataFile1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
	
		sheet.getRow(0).createCell(3).setCellValue("Status");
		sheet.getRow(1).createCell(3).setCellValue("Pass");
		sheet.getRow(2).createCell(3).setCellValue("Fail");
		sheet.getRow(3).createCell(3).setCellValue("Pass");
		
		FileOutputStream fout = new FileOutputStream(src);
	
		wb.write(fout);		fout.close();	wb.close();
		System.out.println("End of program ");
	}		
}
