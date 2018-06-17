package dd_Core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import dd_util.Xls_Reader;

public class CoreTest {
	
	public Xls_Reader excel;
	

	
	public Properties config;
	public Properties object;
	
	 public WebDriver driver;
	
	
	@BeforeSuite
	public void init() throws IOException{
		
		excel = new Xls_Reader("C:\\testdata.xlsx");
		 config = new Properties();
		 object = new Properties();
		 
		 FileInputStream fis1 = new FileInputStream("C:\\Selenium\\genpact.morgonstanley.bdp\\src\\dd_ObjectRepo\\Config.properties");
		 config.load(fis1);
		 FileInputStream fis2 = new FileInputStream("C:\\Selenium\\genpact.morgonstanley.bdp\\src\\dd_ObjectRepo\\Object.properties");
		 object.load(fis2);
		
		if(config.getProperty("browser").equals("firefox")){
			
			driver = new FirefoxDriver();
		}
       if(config.getProperty("browser").equals("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Jar\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
       if(config.getProperty("browser").equals("chrome")){
    	   System.setProperty("webdriver.chrome.driver", "C:\\Jar\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@AfterSuite
	public void tearDown(){
		driver.quit();
		}
	}
