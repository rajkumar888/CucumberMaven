package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
	
		
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();
		

		// implementing global timeout for all web elements
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.findElement(By.id("Email")).sendKeys("seleniumtest5555@gmail.com");
	
	driver.findElement(By.id("next")).click();
	//driver.findElement(By.id("next")).submit();
	driver.findElement(By.id("Passwd")).sendKeys("selenium123");
	
	
	driver.findElement(By.id("signIn")).submit();
	
	Thread.sleep(9000);
	driver.close();
	
	
	}

}
