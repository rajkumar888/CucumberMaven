package actionClassDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;

public class Draggable {

	public static void main(String[] args) throws InterruptedException  {
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Saurabh\\Driver\\geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Saurabh\\Driver\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://jqueryui.com/draggable/");
		
		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		
		
		Actions act = new Actions(driver);
		
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='draggable']/p"));
		
		
		act.clickAndHold(ele).moveByOffset(200, 0).release(ele).build().perform();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}