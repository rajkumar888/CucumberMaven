package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteNewExcelFile {
	public static void main(String[] args) throws IOException {
		
		File src = new File("C:\\Driver\\TestDataFile.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook (fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//Create First Row
		XSSFRow row1 = sheet.createRow(0);		
		XSSFCell r1c1 = row1.createCell(0);		r1c1.setCellValue("Emd Id");
		XSSFCell r1c2 = row1.createCell(1);		r1c2.setCellValue("NAME");
		XSSFCell r1c3 = row1.createCell(2);		r1c3.setCellValue("AGE");
		
		//Create Second Row
		XSSFRow row2 = sheet.createRow(1);
		XSSFCell r2c1 = row2.createCell(0);		r2c1.setCellValue("1");	
		XSSFCell r2c2 = row2.createCell(1);		r2c2.setCellValue("Ram");
		XSSFCell r2c3 = row2.createCell(2);		r2c3.setCellValue("20");		
		
		//Create Third Row
		XSSFRow row3 = sheet.createRow(2);
		XSSFCell r3c1 = row3.createCell(0);		r3c1.setCellValue("2");
		XSSFCell r3c2 = row3.createCell(1);		r3c2.setCellValue("Shyam");
		XSSFCell r3c3 = row3.createCell(2);		r3c3.setCellValue("25");
		
		
		//Create fourth Row
		XSSFRow row4 = sheet.createRow(3);
		XSSFCell r4c1 = row4.createCell(0);		r4c1.setCellValue("21");		
		XSSFCell r4c2 = row4.createCell(1);		r4c2.setCellValue("Shyam1");
		XSSFCell r4c3 = row4.createCell(2);		r4c3.setCellValue("251");
		
	//fis.close();
		
		FileOutputStream fos =new FileOutputStream((src));
	       workbook.write(fos);
	  
	      Iterator <Row> ite = sheet.rowIterator();
			while(ite.hasNext())
			{
				Row row = ite.next();
				Iterator<Cell> cite = row.cellIterator();
				
				while(cite.hasNext()){
					Cell c = cite.next();
					System.out.print(c.toString() +"\t");
				}
				System.out.println();
			}
	      
		     	fos.close();		workbook.close();		System.out.println("Done");
	}
}