package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorExample {
	
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		/*driver.get("https://www.paypal.com");
		
		//a href="https://www.paypal.com/in/webapps/mpp/account-selection" color="white" data-pa-click="main-menu|Sign Up" id="signup-button" class="pypl-btn pypl-btn--small pypl-btn--white mpp-btn" role="button">Sign Up</a>

		//driver.findElement(By.cssSelector("a[id=signup-button]")).click();
		
		driver.findElement(By.cssSelector("a[id=signup-button][color=white]")).click();
		
		driver.findElement(By.cssSelector("a#signup-button")).click();*/
		driver.get("https://www.google.com");
		//class="gb_Me gb_Ha gb_wb" id="gb_70
		driver.findElement(By.cssSelector("a[class$=b_P]")).click();
		
}
}