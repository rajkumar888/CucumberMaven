package excelData;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Testdataconnection {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub

		File f1= new File("C:/Driver/TestDataFile.xls");
		System.out.println(f1);
		
		Workbook w = Workbook.getWorkbook(f1);
		Sheet s = w.getSheet("Sheet1");
		//Sheet s1 = w.getSheet(0);
		int rows=s.getRows();
		int cols=s.getColumns();
		
		System.out.println(rows);		System.out.println(cols);
		
		String inputdata [] [] = new String [rows] [cols];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				Cell c= s.getCell(j, i);
				inputdata[i][j]= c.getContents();
				System.out.println(inputdata[i][j]);
			}
		}
		
		
		
	}

}
