package captureScreenshot;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookDemo3 {
	 WebDriver driver=null;
	
	 
	 @BeforeClass
	 void classic()
	 {System.out.println("hello");}
	 
	 
	 @Test()
	 void test1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-popup-blocking");
	     options.addArguments("--disable-save-password-bubble");
		 options.addArguments("disable-infobars");
	     options.addArguments("--disable-extensions");
	     options.addArguments("--disable-notifications");
	     options.addArguments("--start-maximized");
	     options.addArguments("--disable-web-security");
	     options.addArguments("--no-proxy-server");
	     options.addArguments("--enable-automation");
	     
	     Map<String, Object> prefs = new HashMap<String, Object>();
	     prefs.put("credentials_enable_service", false);
	     prefs.put("profile.password_manager_enabled", false);
	     options.setExperimentalOption("prefs", prefs);
	     
	     DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	     capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	     driver = new ChromeDriver(capabilities);
	     
	     	driver.get("https://www.facebook.com");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("7838183320");
			
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Soma@raju8989");
			
			driver.findElement(By.cssSelector("#loginbutton")).click();}
	 
	 
	 @Test()
	 void test2()
	{
		 
		 System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe");
		 		driver = new FirefoxDriver();
		 		driver.get("https://www.facebook.com/");
				
		 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("7838183320");
				
				
				driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Soma@raju8989");
				
				driver.findElement(By.cssSelector("#loginbutton")).click();
				driver.close();
				
	}
	 
	}

