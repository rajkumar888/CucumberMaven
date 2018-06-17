package testNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GmailScreenshotDemo {
	 
	WebDriver driver;
	
	@Test
	public void captureScreenshotDemo1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		  
		driver=new ChromeDriver();
		  
		driver.manage().window().maximize();
		  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");	
		
		driver.findElement(By.xpath(".//*[@id='Email11']")).sendKeys("Automation");
		
		}
	
	@Test
	public void captureScreenshotDemo2()
	{
		System.out.println(" Test Case  captureScreenshotDemo2 passed  ");
		
		}
	
	@AfterMethod
	public void testIT(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			System.out.println("Test Case Failed");
			Utility.captureScreenshot(driver, result.getName());
		}
		
		//driver.quit();
	}
	}

