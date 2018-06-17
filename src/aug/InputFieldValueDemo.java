package aug;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputFieldValueDemo {

	 static WebDriver driver;

	static String path = "C:\\Driver\\BrowserDriver\\geckodriver.exe";

	static String driverkeyword = "webdriver.gecko.driver";

	
	public static void main(String[] args) {

		System.setProperty(driverkeyword, path);

		driver = new FirefoxDriver();
		
		//driver = new ChromeDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().setScriptTimeout(0, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
	
	//driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("myfacebook");
	
	WebElement ele1=driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[2]/div[1]/div[1]/span"));
	
	
/*	
	System.out.println(ele1.getCssValue("font-size"));
	System.out.println(ele1.getCssValue("color"));
	System.out.println(ele1.getCssValue("font-weight"));
	System.out.println(ele1.getCssValue("background-color"));
	System.out.println(ele1.getCssValue("font-type"));*/
	
	
	
	//boolean any = ele1.isEnabled();
	
	System.out.println(ele1.isEnabled());
	System.out.println(ele1.isDisplayed());	
	System.out.println(ele1.isSelected());
	
	WebElement ele2 = driver.findElement(By.id("u_0_h"));
	
	System.out.println(ele2.isEnabled());
	System.out.println(ele2.isDisplayed());	
	System.out.println(ele2.isSelected());
	
	ele2.click();
	System.out.println(ele2.isSelected());
	

}
}
