package captureScreenshot;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FacebookDemo2 {
	public static void main(String[] args) throws InterruptedException {
	
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
	     WebDriver driver = new ChromeDriver(capabilities);
		
		
	     driver.get("https://www.facebook.com");
	     
	    System.out.println(" Title of this page is > "+ driver.getTitle());
	    
	    String str = driver.getCurrentUrl();
	     
	     
	    System.out.println("  page url is  > "+ str);
	    
	    System.out.println(driver.getPageSource());
	    
	    
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("7838183320");
		
		//driver.findElement(By.cssSelector(".inputtext._58mg._5dba._2ph-")).sendKeys("test1");
		
		driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']")).sendKeys("hello");
		
		Thread.sleep(4000);		driver.quit();
	
		}
}
