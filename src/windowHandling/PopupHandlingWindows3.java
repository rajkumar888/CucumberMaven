package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupHandlingWindows3 {

	static WebDriver driver;

	static String path = "C:\\Driver\\BrowserDriver\\geckodriver.exe";

	static String driverkeyword = "webdriver.gecko.driver";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty(driverkeyword, path);

		// driver = new FirefoxDriver();

		driver = new ChromeDriver();

		driver.get("https://www.naukri.com");
		
		Set<String> allwindows1 = driver.getWindowHandles();
		
		Iterator<String> iter1 = allwindows1.iterator();
		
		while(iter1.hasNext())
		{
			driver.switchTo().window(iter1.next());
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().contains("Prokarma"))
			{
				driver.findElement(By.cssSelector("body > a > img")).click();
			}
		}
		
		
		
		
		/*driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(-2000, 0));

		System.out.println(driver.getTitle());

		String pwindow = driver.getWindowHandle();
		System.out.println(pwindow);

		Set<String> allwindows = driver.getWindowHandles();

		System.out.println(allwindows);

		Iterator<String> iter = allwindows.iterator();

		System.out.println(allwindows.size());

		String parentwindow = iter.next();

		String childwindow1 = iter.next();

		String childwindow2 = iter.next();

		Thread.sleep(2000);
		driver.switchTo().window(childwindow1);
		System.out.println(driver.getTitle());
		 driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(-2000, 0));

		Thread.sleep(2000);
		driver.switchTo().window(childwindow2);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(-2000, 0));
		
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		 driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(-2000, 0));

		
		for (String aw : allwindows) {
			driver.switchTo().window(aw);
			
			driver.manage().window().maximize();
			driver.manage().window().setPosition(new Point(-2000, 0));
			
			System.out.println(driver.getTitle());*/
		}

		//driver.quit();
	}


