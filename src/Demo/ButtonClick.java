package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.paypal.com/in/webapps/mpp/home");
		
		/*System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());
		*/
		
		driver.get("https://www.google.co.in");
		driver.findElement(By.cssSelector(".gsfi")).sendKeys("html elements");
		driver.findElement(By.cssSelector("button[type='Submit']")).click();
		
	} 

}
