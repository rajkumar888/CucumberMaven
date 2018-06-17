package actionClassDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class MultipleSelect2 {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Saurabh\\Driver\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		ChromeOptions cOptions = new ChromeOptions();
	    cOptions.addArguments("test-type");
	    cOptions.addArguments("start-maximized");
	    cOptions.addArguments("-incognito");
	    cOptions.addArguments("--js-flags=--expose-gc");  
	    cOptions.addArguments("--enable-precise-memory-info"); 
	    cOptions.addArguments("--disable-popup-blocking");
	    cOptions.addArguments("--disable-default-apps"); 
	    cOptions.addArguments("disable-infobars");
	 	
		WebDriver driver = new ChromeDriver(cOptions);
		
		
		
		driver.get("http://jqueryui.com/selectable/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();

		driver.switchTo().frame(0);

		List<WebElement> selectOption = driver.findElements(By.xpath("html/body/ol/li"));

	
			
		System.out.println(selectOption.size());
		
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.LEFT_CONTROL).perform();

		for (int i = 0; i < selectOption.size(); i++) {

			//if (i % 2 == 0) {
				
				Thread.sleep(2000);
				
				//act.click(selectOption.get(i-1)).perform();
				//act.click(selectOption.get(i)).perform();
				
				
				act.click(driver.findElement(By.xpath("html/body/ol/li["+(i+1)+"]"))).perform();
				
				//System.out.println(selectOption.get(i - 1).getText() + " is Selected");
				//System.out.println(selectOption.get(i).getText() + " is Selected");
			//}
		}	// end of for loop
		
		act.keyUp(Keys.LEFT_CONTROL).perform();
		
		Thread.sleep(5000);

		 driver.close();

	}

}