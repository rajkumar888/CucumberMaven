package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;




public class FirefoxDemo {

	public static void main(String[] args) throws InterruptedException {
	
		/*System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);

		WebDriver driver = new FirefoxDriver(capabilities);*/
		//WebDriver driver = new FirefoxDriver();
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		WebDriver driver;
		
		/*driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();*/
		
		driver = new FirefoxDriver(capabilities);
		driver.get("https://www.google.com");	
	
		//driver.close();
		Assert.assertEquals("Google1", driver.getTitle());
		
	}
		
	}


