package actionClassDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PointClassDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		
		
		
	WebElement element = driver.findElement(By.xpath("//*[@id='u_0_4']"));
		
		
		System.out.println(element.getLocation());
		
		System.out.println(element.getLocation().x);
		
		System.out.println(element.getLocation().y);
		System.out.println(element.getLocation().getX());
		System.out.println(element.getLocation().getY());
	}

}
