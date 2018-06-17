package testNGdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class TestListenerDemo implements ITestListener {
	private WebDriver driver;
	String filePath = "C:\\workspace\\SeleniumTesting\\Screenshots\\";
	

	public void onTestFailure(ITestResult result) 
	{
		this.driver = ((GmailScreenshotDemo)result.getInstance()).driver;
		
		
		// to copy the instance of driver from test case class to test listener class
		
		System.out.println("***** Error "+result.getName()+" test has failed *****");
	
		String methodName=result.getName().toString().trim();
	
		//Utility.captureScreenshot(driver, methodName);
		takeScreenShotDemo(methodName);
		driver.close();
	}
	
	
		public void takeScreenShotDemo(String methodName)
		{
			
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//The below method will save the screen shot in d drive with test method name 
		try {
				FileUtils.copyFile(source, new File(filePath+methodName+System.currentTimeMillis()+".png"));
				System.out.println("***Placed screen shot in "+filePath+" ***");
			} 
			catch (IOException e)
		{e.printStackTrace();
		}
		
		}
	
	

	public void onTestSuccess(ITestResult result) {
		
		
		System.out.println("***** Success "+result.getName()+" test has Passed *****");
		}


	public void onTestSkipped(ITestResult result) {
		
		// TODO Auto-generated method stub
		}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{ 
		// TODO Auto-generated method stub
	}


@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}
@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}
}