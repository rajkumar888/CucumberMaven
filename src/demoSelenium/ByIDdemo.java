package demoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByIDdemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:/Driver/geckodriver.exe");

		FirefoxDriver ffd = new FirefoxDriver();

		ffd.get("https://www.facebook.com");
		
		ffd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*
		ffd.findElement(By.className("_58mg")).sendKeys("class name demo");
		
		ffd.findElement(By.id("u_0_3")).sendKeys("id demo");
		
		ffd.findElement(By.name("reg_email__")).sendKeys("by name  demo");	*/	
	
		
		//ffd.findElement(By.linkText("Forgotten account?")).click();
		// this will find the link and will click on it.
		
		
		
		//ffd.findElement(By.partialLinkText("Forgotten")).click();
		
		
		ffd.findElement(By.tagName("a")).click();
		
		//ffd.findElement(By.tagName("input")).sendKeys("hello");
		
		System.out.println(ffd.findElement(By.tagName("a")).getText());

}
}
