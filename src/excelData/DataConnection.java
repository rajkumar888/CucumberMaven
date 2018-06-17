package excelData;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataConnection {
	WebDriver driver;
	@Test(dataProvider="testdata")
	public void testRun(String uname, String passwd) throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(uname);
		driver.findElement(By.xpath("//*[@id='next']")).click();
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(passwd);
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		Thread.sleep(4000);  		driver.close();
	}
	
	
	
	@DataProvider(name="testdata")
	public  Object[][] readExcel() throws BiffException, IOException {
		

		File f1= new File("C:/Driver/TestDataFile.xls");
		System.out.println(f1);
		
		Workbook w = Workbook.getWorkbook(f1);
		Sheet s = w.getSheet("Sheet1");
		
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
		
		return inputdata;
			
	}

}

