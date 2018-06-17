package myproject_clz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_my_booking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\new testing software\\new jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver z=new ChromeDriver();
		z.get("https://www.jetstay.com/login.html");
		z.manage().window().maximize();
		z.findElement(By.xpath(".//*[@id='emailId']")).sendKeys("sheetalmca1995@gmail.com");
		z.findElement(By.xpath(".//*[@id='useremail']")).sendKeys("sheetalmca1995@gmail.com");

		z.findElement(By.id("contNo")).sendKeys("8396929190");
		z.findElement(By.xpath(".//*[@id='home']/section/div[1]/div/div[2]/div/form/span")).click();
		z.findElement(By.xpath(".//*[@id='rcode']")).sendKeys("8932");
		
		z.findElement(By.xpath(".//*[@id='home']/section/div[1]/div/div[2]/div/form/div[4]/input")).click();
	}

}
