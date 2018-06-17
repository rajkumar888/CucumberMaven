package actionClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\BrowserDriver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	ChromeDriver driver1 = new ChromeDriver();
	
	SearchContext driver3 =  new ChromeDriver();

	//driver.get("http://way2automation.com");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	//	WebElement selenium = driver.findElement(By.cssSelector("#outer > div.menu > ul > li:nth-child(3) > a"));
	// SeleniumVideoTutorials  = driver.findElement(By.cssSelector("#flexmenu2 > li:nth-child(3) > a"));
		
		
		driver.get("https://www.facebook.com");
		
		Actions act = new Actions(driver);
		
	
		
		//act.moveToElement(selenium).perform();
		
		//Thread.sleep(2000);
		
		//act.click(SeleniumVideoTutorials).perform();
		
		//driver.close();
		
		
		
		//WebElement Leaders = driver.findElement(By.xpath("//h1[contains(text(),'Leaders')]"));
		//Thread.sleep(2000);
		
		//act.moveToElement(providing).doubleClick().perform();
		
		
		
	
	
		try {
			WebElement ele = driver.findElement(By.xpath("//*[@id='log8888in_form']/table/tbody/tr[3]/td[2]/div/a"));
			
		
			//act.keyDown(Keys.LEFT_SHIFT).click(ele).keyUp(Keys.LEFT_SHIFT).build().perform();
			
			act.moveToElement(ele).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		} 
		catch (Exception e) {
			
			//e.printStackTrace();
		System.out.println(e.getMessage());
			
			System.out.println("we are in catch block");
		}
		
		finally{
			System.out.println("we are in finally block");
		}
		
		
		System.out.println("end of program");
	
	//	driver.quit();
	
	}

}
