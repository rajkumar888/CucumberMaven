package actionClassDemo;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PointClassDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		
		//driver.get("https://www.facebook.com");
		
		Point var2 = new Point(-2000,0);
		
		
		//System.out.println( var2 );
		
		
		driver.manage().window().setPosition(var2);
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(3000);
		
		driver.manage().window().maximize();

		System.out.println(driver.manage().window().getPosition());
		
		
		driver.manage().window().setPosition(new Point(150,500));
		
		
		System.out.println(driver.manage().window().getPosition());
		
		System.out.println(driver.manage().window().getPosition().x);
		System.out.println(driver.manage().window().getPosition().y);
		System.out.println(driver.manage().window().getPosition().getX());
		System.out.println(driver.manage().window().getPosition().getY());
		
	}

}
