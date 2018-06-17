package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupHandling  {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.naukri.com");
		 System.out.println(driver.getTitle());
		
		Thread.sleep(3000);		
		
		Set <String> allwindows=driver.getWindowHandles();
		Iterator <String> iter = allwindows.iterator();
		
		System.out.println(allwindows+" has iteratros  "+iter);
		
		String pw=iter.next(); 				
		String fw=iter.next();
		
		
		Thread.sleep(3000);					driver.switchTo().window(pw); System.out.println(driver.getTitle());
		Thread.sleep(3000);					driver.switchTo().window(fw); System.out.println(driver.getTitle());
		Thread.sleep(3000);					driver.switchTo().window(pw); System.out.println(driver.getTitle());
		Thread.sleep(3000);					driver.switchTo().window(fw); System.out.println(driver.getTitle());
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		
		Set <String> allwindows1=driver.getWindowHandles();
		
		Iterator <String> iter1 = allwindows1.iterator();
		
		System.out.println(allwindows1+" "+iter1);
		String pw1=iter1.next(); 				
		String fw1=iter1.next();
		String sw1=iter1.next();
		
		Thread.sleep(3000);					driver.switchTo().window(pw1); System.out.println(driver.getTitle());
		Thread.sleep(3000);					driver.switchTo().window(fw1); System.out.println(driver.getTitle());
		Thread.sleep(3000); 				driver.switchTo().window(sw1);  System.out.println(driver.getTitle());
		Thread.sleep(3000);					driver.switchTo().window(pw1); System.out.println(driver.getTitle());
		Thread.sleep(3000);					driver.switchTo().window(fw1); System.out.println(driver.getTitle());
		Thread.sleep(3000); 				driver.switchTo().window(sw1);  System.out.println(driver.getTitle());
		Thread.sleep(3000); 				driver.quit();
	}
}
