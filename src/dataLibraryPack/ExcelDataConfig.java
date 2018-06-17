package dataLibraryPack;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;			XSSFSheet sheet;		File src;
	
	public ExcelDataConfig(String excelpath) throws IOException
	{	
		src = new File(excelpath);	
		System.out.println("file name to read "+src);
		}
	
	
	public String getData(int sheetnum, int row, int col) throws IOException 
	{
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		System.out.println("sheet number "+sheetnum + " row number " + (row+1) +" column number "+(col+1));
		sheet = wb.getSheetAt(sheetnum);
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
/*	public void writeData(int sheetnum, int row, int col, String comment) throws IOException 
	{
		FileOutputStream fout=new FileOutputStream(src);
		wb.write(fout);
		System.out.println(" writing data into sheet number "+sheetnum + " row number " + (row+1) +" column number "+(col+1));
		sheet = wb.getSheetAt(sheetnum);
		sheet.getRow(row).createCell(col).setCellValue(comment);
		
	}*/
	
	public void closeWorkbook() throws IOException 
	{ 		wb.close();		}	
}
