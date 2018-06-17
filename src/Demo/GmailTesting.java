package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		//driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("akhilesh");
		WebElement userId=driver.findElement(By.xpath("//*[@id='Email']"));
		userId.sendKeys("rajkumar888");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		System.out.println("checkbox is selected: "+driver.findElement(By.xpath("//*[@id='PersistentCookie']")).isSelected());
		driver.findElement(By.xpath("//*[@id='PersistentCookie']")).click();
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("Soma@raju67");
		
		driver.findElement(By.xpath("//*[@id='signIn']")).click();		
		driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		
	}

}
