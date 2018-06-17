package aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowDemo2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		Point pos = driver.manage().window().getPosition();
		
		System.out.println(pos);
		
		System.out.println(pos.x);
		System.out.println(pos.y);
		
		System.out.println(pos.getX());
		
		System.out.println(pos.getX());
		
		driver.get("https://www.facebook.com");
		

		driver.quit();

	}

}
