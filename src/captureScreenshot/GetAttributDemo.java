package captureScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		//
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		
		System.out.println(ele.getAttribute("href"));
	}

}
