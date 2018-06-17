package myproject_clz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageBooking {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","F:\\new testing software\\new jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver w1=new ChromeDriver();
		w1.get("https://www.jetstay.com");
		w1.manage().window().maximize();
		w1.findElement(By.xpath(".//*[@id='myaccountBtn']/div")).click();
		
		w1.findElement(By.xpath(".//*[@id='manage_booking']")).click();
		w1.findElement(By.id("emailId")).sendKeys("Sheetalmca1995@gmail.com");
		
		//enter wrong password-->
		//w1.findElement(By.id("passwd")).sendKeys("catty12");
		
		
		w1.findElement(By.id("passwd")).sendKeys("catty123");
		w1.findElement(By.xpath(".//*[@id='home']/section/div[1]/div/div[1]/div/form/div[8]/input")).click();
		
		w1.close();
		
		// stil not working   w1.findElement(By.xpath(".//*[@id='myaccountBtn']/div")).click();
		// not working ?   
		// how i can logout >is link or not 
		//w1.findElement(By.xpath(".//*[@id='logout']")).click();
		
		// forget passsowrd apply 
		
		
	}

}
