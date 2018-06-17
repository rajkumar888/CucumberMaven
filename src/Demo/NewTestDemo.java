package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
	
		
				
				driver.findElement(By.cssSelector("[id^='navbar-login-link']")).click();
	}

}
