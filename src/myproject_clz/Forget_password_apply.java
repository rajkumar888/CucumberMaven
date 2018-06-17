package myproject_clz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forget_password_apply {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\new testing software\\new jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.jetstay.com/login.html");
		a.manage().window().maximize();
		a.findElement(By.xpath(".//*[@id='emailId']")).sendKeys("sheetalmca1995@gmail.com");
		
		
		a.findElement(By.xpath(".//*[@id='fpass']")).click();
		
		// forget password are not sending me forget password link.
	}

}
