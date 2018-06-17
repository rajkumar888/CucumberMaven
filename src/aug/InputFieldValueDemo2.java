package aug;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputFieldValueDemo2 {

	static WebDriver driver;

	static String path = "C:\\Driver\\BrowserDriver\\geckodriver.exe";

	static String driverkeyword = "webdriver.gecko.driver";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty(driverkeyword, path);

		//driver = new FirefoxDriver();
		
		driver = new ChromeDriver();

	driver.get("https://www.facebook.com");
	
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("myfacebook");
	
	String str= driver.findElement(By.xpath(".//*[@id='email']")).getAttribute("value");
	
	System.out.println(str);
	
	
	if(str.contains("face"))
	{
		System.out.println("expected is as the actual");
	}
	else
	{
		System.out.println("expected is not as  per the  actual");
	}
	
	
	
	}

}
