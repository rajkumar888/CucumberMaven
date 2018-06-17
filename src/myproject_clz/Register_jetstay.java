package myproject_clz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Register_jetstay {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",  "F:\\new testing software\\new jarfiles\\chromedriver_win32\\chromedriver.exe");		
		WebDriver w= new ChromeDriver();
		w.get("https://www.jetstay.com");
		w.manage().window().maximize();
		
		w.findElement(By.xpath(".//*[@id='myaccountBtn']/div/div[3]/i")).click();
		w.findElement(By.xpath(".//*[@id='register']")).click();
		
		//w.findElement(By.id("title")).sendKeys("Dr.");
		
		w.findElement(By.id("f_name")).sendKeys("sheetal");
		w.findElement(By.id("l_name")).sendKeys("chaurasiya");
		w.findElement(By.id("emailId")).sendKeys("sheetalmca1995@gmail.com");
		w.findElement(By.id("password1")).sendKeys("catty123");
		w.findElement(By.id("password2")).sendKeys("catty123");
		
	
		w.findElement(By.name("phoneNo")).sendKeys("8396929190");
		
		w.findElement(By.name("GSTNumber")).sendKeys("07BKQFS5911R1Z4");
		w.findElement(By.id("CompanyName")).sendKeys("patanhi");
		w.findElement(By.xpath(".//*[@id='referralcode']")).sendKeys("8956");
		w.findElement(By.xpath(".//*[@id='save']")).click();
	}

}
