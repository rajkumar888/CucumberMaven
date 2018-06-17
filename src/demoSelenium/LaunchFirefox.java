package demoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// this will launch the firefox browser
		
		driver.get("https://www.facebook.com");
		// to open an url in the opened browser
		
		System.out.println(" like my facebook page has opened ");
		
	   driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("hello");
// find element is used to find any web element and by.xpath is a kind of location to itentify unique webelement.
	   // send keys is a method to perform any writing action on any webelement.
	   driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys(" again ");
	   driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys(" hello ");
	   driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys(" nextitem ");
	   driver.findElement(By.xpath(".//*[@id='u_0_1']")).clear();
	  
	   driver.findElement(By.xpath(" .//*[@id='u_0_q']")).click();
	}

}
