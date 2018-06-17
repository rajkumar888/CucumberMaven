package actionClassDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver", "C:\\Driver\\BrowserDriver\\chromedriver.exe");

		// WebDriver driver = new FirefoxDriver();

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://jqueryui.com/droppable/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame(0);

		
		WebElement Sourcelocator = driver.findElement(By.cssSelector(".ui-draggable"));
		
		WebElement Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
		

		Actions act = new Actions(driver);

		act.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();
		
		

		// driver.close();
	} 
	}

