package iframeDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IframeDemo {

	WebDriver driver=new FirefoxDriver();
	List <WebElement> framecnt;
	long time=6000;
	
	
	@Test
	public void start() throws InterruptedException
	{
		driver.get("http://www.seleniumhq.org");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("close")).click();
		
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.id("close")).click();
		driver.findElement(By.xpath(".//*[@id='mainContent']/table[1]/tbody/tr[1]/td[6]/a")).click();
	
		//driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		framecnt= driver.findElements(By.tagName("frame"));
		System.out.println("total no of frames in this page\t"+ framecnt.size());
		System.out.println(framecnt);  
		
		// to switch to one frame to another first user has to switch to default content, its mandatory
		driver.switchTo().defaultContent();
		
		
		// find frame by id or name
		driver.switchTo().frame("packageListFrame");	
		
		// find frame by index
		//driver.switchTo().frame(0);
		
			// click on any link in the frame first
		driver.findElement(By.xpath("html/body/div[2]/ul/li[6]/a")).click();
		Thread.sleep(time);		driver.navigate().back();
		
		
		Thread.sleep(time);			
		driver.switchTo().defaultContent();	
		// switch to frame by index
		driver.switchTo().frame(1); 
		
		// click on any link in the frame second
		driver.findElement(By.xpath("html/body/div/ul/li[30]/a")).click();
		Thread.sleep(time);		driver.navigate().back();
		
		driver.switchTo().defaultContent();
		
		
		// creating a webelement  for frame
		WebElement myframe3= driver.findElement(By.xpath("//frame[@name='classFrame']"));
		
		// switching to frame by webelement of the frame
		driver.switchTo().frame(myframe3);			//driver.switchTo().frame(2);	
		
		Thread.sleep(time);		driver.findElement(By.xpath("html/body/div[1]/ul/li[5]/a")).click();
		Thread.sleep(time);		driver.navigate().back();
		Thread.sleep(time);		driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[4]/td[1]/a")).click();	
		Thread.sleep(time);		driver.navigate().back();
		Thread.sleep(time);		driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[4]/td[1]/a")).sendKeys(Keys.CONTROL,Keys.HOME);
		Thread.sleep(time);		driver.findElement(By.xpath("html/body/div[1]/ul/li[5]/a")).click();
		Thread.sleep(time);		driver.navigate().back();
		driver.quit();

}		// end of public void start() throws InterruptedException
}		// end of public class IframeDemo