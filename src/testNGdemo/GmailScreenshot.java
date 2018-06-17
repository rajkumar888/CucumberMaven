package testNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class GmailScreenshot {
 
		WebDriver driver;
		
		@Test
		public void captureScreenshot() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			  
			driver=new ChromeDriver();
			  
			driver.manage().window().maximize();
			  
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://www.gmail.com");	
			
			
			driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("Automation");		
			
			
		}
		
		@AfterMethod
		public void testIT(ITestResult result)
		{
			if(ITestResult.FAILURE==result.getStatus())
			{
				
				System.out.println("Test Case Failed");
				//Utility.captureScreenshot(driver, result.getName());
			}
			
			//driver.quit();
		}
		}

