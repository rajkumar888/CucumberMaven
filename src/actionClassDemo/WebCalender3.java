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

public class WebCalender3 {

	static WebDriver driver;
	
	

	public static void main(String[] args) throws IOException {
		
		String month="APRIL";
		String year="2018";
		String day="24";
		
		String url="https://www.makemytrip.com/";

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click(); // this is for calendar click

		while(true)
		{
			WebElement element1 = driver.findElement(By.xpath("//*[contains(@id,'dp15038')]/div/div[1]/div/div/span[1]"));
			
			WebElement element2 = driver.findElement(By.xpath("//*[contains(@id,'dp15038')]/div/div[1]/div/div/span[2]"));
			
			WebElement element3 = driver.findElement(By.xpath("//*[contains(@id,'dp15038')]/div/div[2]/div/div/span[1]"));
			
			WebElement element4 = driver.findElement(By.xpath("//*[contains(@id,'dp15038')]/div/div[2]/div/div/span[2]"));
			
			//*[@id="dp1503832437679"]/div/div[1]/div/div/span[1]
			
			System.out.println(element1.getText()+" "+element2.getText());
			//System.out.print(element3.getText()+" "+element4.getText()+" ");
		
			String temp1=element1.getText();
			String temp2=element2.getText();
			String temp3=element3.getText();
			String temp4=element4.getText();
			
			if ((temp1.contains(month)) && (temp2.contains(year)) || (temp3.contains(month)) && (temp4.contains(year)))
			{
				break;
			}
			else
			{
			driver.findElement(By.xpath("//*[contains(@id,'dp15038')]/div/div[2]/div/a/span")).click();
			}
		}
		
		/*boolean flag=false;
				List<WebElement> rows = driver.findElements(By.xpath("//*[contains(@id,'dp15038')]/div/div[2]/table/tbody/tr"));
				
				for (int r = 1; r <= rows.size(); r++) 
				{
					List<WebElement> cols = driver.findElements(By.xpath("//*[contains(@id,'dp15038')]/div/div[2]/table/tbody/tr["+r+"]/td"));

					for (int c = 0; c < cols.size(); c++) 
					{
						WebElement ele = cols.get(c);

						if (ele.getText().equals(day))
						{
							ele.click();
							flag=true;
							break;
						}
						
					}		// inner for loop
					
					if(flag)
					{
						break;
					}
				
				} // end of outer for loop
				*/
	} // end of main
} // end of class
