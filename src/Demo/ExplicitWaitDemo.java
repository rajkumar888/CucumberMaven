package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id()));
		
		
	}

}
