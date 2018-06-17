package aug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		
		Dimension size = driver.manage().window().getSize();

		System.out.println(size);

		System.out.println(size.height);
		System.out.println(size.width);

		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		System.out.println("======================================");

		driver.manage().window().maximize();
		
		Dimension size1 = driver.manage().window().getSize();

		System.out.println(size1);

		System.out.println(size1.height);
		System.out.println(size1.width);

		System.out.println(size1.getHeight());
		System.out.println(size1.getWidth());
		System.out.println("======================================");
		
		driver.manage().window().setSize(new Dimension(0,0));
		Dimension size3= driver.manage().window().getSize();
		System.out.println(size3.getHeight());
		System.out.println(size3.getWidth());
		
		

		//driver.quit();

	}

}
