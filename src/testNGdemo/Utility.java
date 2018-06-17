package testNGdemo;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utility 
{


	public static void captureScreenshot(WebDriver driver, String screenshotname) 
	{
		try
		{
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("C:\\workspace\\SeleniumTesting\\Screenshots\\"+screenshotname+System.currentTimeMillis()+" test.png"));

			System.out.println("Screenshot Taken");

		}
		catch(Exception excep)
		{
			System.out.println("Throwing exception while taking screenshot" +excep.getMessage());
		}
	}


	public static String generateDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		//get current date time with Date()
		Date date = new Date();

		// Now format the date
		return dateFormat.format(date);
		}
}