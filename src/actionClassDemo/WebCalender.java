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

public class WebCalender {

	
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws Exception {
	
		//driver=new FirefoxDriver();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screentshot();

		//selecting date of journey
		driver.findElement(By.xpath(".//*[@id='gmg_wp_notif']/div[2]/button[1]")).click(); 
		
		
		
		screentshot();
		
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/span")).click(); 
		
		
		
		screentshot();
				
	
		
	driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();  // this line of code is for next month
	screentshot();	
	
	
	List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
	
	
	for(int r = 1 ; r <= rows.size(); r++ )
	{
		List<WebElement> cols = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+r+"]/td"));
		
		for(int c = 0 ; c < cols.size(); c++ )
		{
			WebElement ele = cols.get(c);
			
			
			System.out.print(ele.getText()+"\t");
		}
		System.out.println();
	}
		
	
	
	
	driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();  // this line of code is for next month
	
	
	driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();  // this line of code is for next month
	
	
	for(int r = 1 ; r <= rows.size(); r++ )
	{
		List<WebElement> cols = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+r+"]/td"));
		
		for(int c = 0 ; c < cols.size(); c++ )
		{
			WebElement ele = cols.get(c);
			
			String str=ele.getText();
			
			if(str.equals("15"))
			{
				ele.click();
				break;
			}
			
			//System.out.print(ele.getText()+"\t");
		}
		System.out.println();
	}
	
	
	
	screentshot();
	
	//driver.close();

	}

	
	
	public static void screentshot() throws Exception
	{
		try {
			
			SimpleDateFormat folder = new SimpleDateFormat("yyyy-MM-dd") ;
			
			SimpleDateFormat file = new SimpleDateFormat("yyyy-MM-dd HH mm ss") ;
						    
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File dfile = new File("C:\\Driver\\Screenshot\\"+folder.format(new Date())+"/"+file.format(new Date())+" "+System.currentTimeMillis() + ".png");
			
			FileUtils.copyFile(src, dfile);
		} 
		
		catch (Exception e) {

			e.printStackTrace();
			//System.out.println("we are into catch block inside the screenshot ");
		}

	}
}
