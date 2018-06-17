package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTestGmail {

	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Gma")).click();
		driver.findElement(By.tagName("a")).click();

	}

}
