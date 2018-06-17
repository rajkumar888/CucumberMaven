package actionClassDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebCalender2 {

	static WebDriver driver;
	
	

	public static void main(String[] args) throws IOException {
		
		String monthyear="Dec 2018";
		
		String day="14";
		
		String url="https://www.redbus.in/";

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		// selecting date of journey
		driver.findElement(By.xpath(".//*[@id='gmg_wp_notif']/div[2]/button[1]")).click(); // notification popup

		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/span")).click(); // this is for calendar click

		//*[@id="rb-calendar_onward_cal"]/table/tbody/tr[1]/td[2]

		
		while(true)
		{
			System.out.println(driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText());
			
			WebElement element = driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]"));
			
			
			
			String temp=element.getText();
			
			if ((temp.equalsIgnoreCase(monthyear)) )
			{
				break;
			}
			else
			{
			driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
			}
		}
			
				List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
				for (int r = 1; r <= rows.size(); r++) {
					List<WebElement> cols = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + r + "]/td"));

					for (int c = 0; c < cols.size(); c++) {
						WebElement ele = cols.get(c);

						if (ele.getText().equals(day))
						{
							ele.click();
							break;
						}
					}
				} // end of outer for loop
				
	
		

		

	} // end of main
} // end of class
