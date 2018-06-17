package captureScreenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class TestDemoFirefox2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		
		FirefoxProfile pro = new FirefoxProfile();
		pro.setPreference("dom.webnotifications.enabled",false);
		WebDriver driver = new FirefoxDriver(pro);
		
		driver.get("http://www.jabong.com/clearance-sale");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		
		  WebElement element= driver.findElement(By.cssSelector("#mainTopNav > li.nav-women > a"));
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(element).perform();
		
		Thread.sleep(1000);
		 driver.findElement(By.linkText("New In clothing")).click();
		
	}
}
