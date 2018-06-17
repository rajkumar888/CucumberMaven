package captureScreenshot;

//Import all classes and interface
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FacebookScreenshot {
	
		WebDriver driver;
	
	@Test
	public void captureScreenshot() throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe");
	
		driver=new FirefoxDriver();
	
	// Maximize the browser
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// Pass application url
	driver.get("http://www.facebook.com");
	
	// Here we are forcefully passing wrong id so that it will fail our testcase
	driver.findElement(By.xpath(".//*[@id='email111']")).sendKeys("Learn Automation");
	}
	
	
//It will execute after every test execution 
		@AfterMethod
		public void tearDown(ITestResult result)
		{
	//Here will compare if test is failing then only it will enter into if condition
	if(ITestResult.FAILURE==result.getStatus())
	{
		try 
		{
			//Create refernce of TakesScreenshot
			TakesScreenshot ts=(TakesScreenshot)driver;
		
			//Call method to capture screenshot
			File source=ts.getScreenshotAs(OutputType.FILE);

			//Copy files to specific location here it will save all screenshot in our project home directory and
			//result.getName() will return name of test case so that screenshot name will be same
			FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+System.currentTimeMillis()+".png"));

			System.out.println("Screenshot taken");
			} 
			catch (Exception e)
			{

				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 

			}
			//close application
			driver.quit();
			}
}
