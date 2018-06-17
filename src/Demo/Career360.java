package demo;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Career360 
{
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.engineering.careers360.com");
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[3]/a")).click();
		driver.findElement(By.xpath("html/body/div[3]/div/header/div/div/section[2]/div/div[5]/div/ul/li/a")).click();
		driver.findElement(By.xpath("html/body/div[17]/div/div/div[2]/div/form/div/div/div/div[1]/div[1]/input")).sendKeys("rajkumar888@gmail.com");
		driver.findElement(By.xpath("html/body/div[17]/div/div/div[2]/div/form/div/div/div/div[1]/div[2]/input")).sendKeys("Soma@raju67");
		driver.findElement(By.xpath("html/body/div[17]/div/div/div[2]/div/form/div/div/div/div[1]/div[3]/input")).click();
	}
	
}