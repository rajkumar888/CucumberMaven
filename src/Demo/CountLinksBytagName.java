package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLinksBytagName {
	
	

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.paypal.com");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
	}

}
