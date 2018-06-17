package captureScreenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class TestDemoFirefox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.startup.homepage", "http://www.google.com");
//		
//		FirefoxDriver driver = new FirefoxDriver(profile);
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		
		 //Opening the URL
		  driver.get("http://www.jabong.com/clearance-sale");
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  
		  //Implicit wait for the browser to launch
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  WebElement element= driver.findElement(By.cssSelector("#mainTopNav > li.nav-women > a"));
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(element).perform();
		
		Thread.sleep(1000);
		 driver.findElement(By.linkText("New In clothing")).click();
		
	}

}
