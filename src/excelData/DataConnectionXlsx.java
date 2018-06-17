package excelData;


import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

/*import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;*/
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataConnectionXlsx {
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
	public  Object[][] readExcel() throws Exception {
	
		File f1= new File("C:/Driver/TestDataFile2007.xlsx");
		System.out.println(f1);
		
		FileInputStream fis= new FileInputStream(f1);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows=sheet.getLastRowNum()+1;
		int cols=2;

		System.out.println(rows);		System.out.println(cols);

		String inputdata [] [] = new String [rows] [cols];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				inputdata[i][j]= data;
			
				System.out.println(inputdata[i][j]);
			}
		}
		workbook.close();
		return inputdata;
			
	}
	}

