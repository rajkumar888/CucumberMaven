package aug;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Test;

class DemoScreenshot {

	static FirefoxDriver driver;

	// driver = new FirefoxDriver();

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\BrowserDriver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("https://www.facebook.com");
		screenshot();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("hello");
		screenshot();

		driver.findElement(By.id("pass")).sendKeys("hello");
		screenshot();

		WebElement dropdownday = driver.findElement(By.xpath("//*[@id='day']"));
		WebElement dropdownmoth = driver.findElement(By.xpath("//*[@id='month']"));
		WebElement dropdownyear = driver.findElement(By.xpath("//*[@id='year']"));

		Select day = new Select(dropdownday);
		Select month = new Select(dropdownmoth);
		Select year = new Select(dropdownyear);

		day.selectByIndex(2);
		screenshot();

		month.selectByIndex(9);
		screenshot();

		year.selectByVisibleText("1985");
		screenshot();

		Thread.sleep(5000);
		
		
		// how to print the values of the drop down
		
		List<WebElement> allmonth = month.getOptions();
		
		for (WebElement    m : allmonth)
		{
			System.out.println(m.getText());
		}
		

		/*
		 * day.selectByValue("23"); screenshot();
		 * 
		 * Thread.sleep(2000); day.selectByVisibleText("14"); screenshot();
		 */

		/*
		 * driver.findElement(By.cssSelector("#u_0_r")).click(); screenshot();
		 */

		driver.close();

		System.out.println("end of program");
	}

	public static void screenshot() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Screenshot\\" + System.currentTimeMillis() + "Test.png"));
	}

}
