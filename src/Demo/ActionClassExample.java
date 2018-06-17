package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");

		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("rajkumar888");
		
		Thread.sleep(4000);
		Actions action=new  Actions(driver);
		action.sendKeys(Keys.TAB).perform();

		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		action.sendKeys(Keys.PAGE_UP).perform();
		
/*				Actions actions = new Actions(driver);
				WebElement mainMenu = driver.findElement(By.linkText("menulink"));
				actions.moveToElement(mainMenu);

				WebElement subMenu = driver.findElement(By.cssSelector("subLinklocator"));
				actions.moveToElement(subMenu);
				actions.click().build().perform();
*/	}

}
