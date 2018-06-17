package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot 
{
	static WebDriver driver;
	public static void main(String[]args)throws IOException, InterruptedException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Driver/test1.html");
		Alert testalert = driver.switchTo().alert();
		String str = testalert.getText();
		Thread.sleep(3000);
		System.out.println(str);
		testalert.accept();
		Thread.sleep(3000);
		
		driver.get("file:///C:/Driver/test2.html");
		testalert = driver.switchTo().alert();
		Thread.sleep(3000);
		testalert.dismiss();
		
    	driver.get("http://www.gmail.com");
		try	{
			driver.findElement(By.id("Email1")).sendKeys("rajkumar888");
			}
		catch(Throwable t)
		{
		System.out.println(t);
			
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.out.println(screenshot);
			FileUtils.copyFile(screenshot, new File("C:\\Driver\\"+System.currentTimeMillis()+" test.png"));
		}
	}
	}