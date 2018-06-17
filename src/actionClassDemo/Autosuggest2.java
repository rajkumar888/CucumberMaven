package actionClassDemo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggest2 {
	
	//public class Ajax_Handle {
	public static void main(String[] args) throws InterruptedException {
	
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver.manage().window().maximize();
				
				driver.get("http://www.google.com");
				
				driver.findElement(By.id("lst-ib")).sendKeys("selenium", Keys.ENTER);

				
				
				List<WebElement> alllink = driver.findElements(By.xpath("//h3/a"));
				
				
				System.out.println(alllink.size());
				
				
				for(int i=0 ;   i < alllink.size() ; i++ )
				{		
					alllink = driver.findElements(By.xpath("//h3/a"));
					
					//System.out.println(alllink.get(i).getText());
					
					alllink.get(i).click();
					
					
					System.out.println(driver.getTitle());
					
					driver.navigate().back();
				}
	}
			}