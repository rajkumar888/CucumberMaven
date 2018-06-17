package myproject_clz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile_jetstay {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\new testing software\\new jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver q= new ChromeDriver();
		q.get("https://www.jetstay.com");
		q.manage().window().maximize();
		q.get("https://www.jetstay.com/profile.html");
		q.findElement(By.xpath(".//*[@id='myaccountBtn']/div")).click();
		q.findElement(By.xpath(".//*[@id='profile']")).click();
		
		//q.findElement(By.id("full_name")).sendKeys(" sheetal chaurasiya");
		//q.findElement(By.id("emailId")).sendKeys("sheetalmca1995@gmail.com");
		//q.findElement(By.name("ph_no")).sendKeys("9992210605");
		//q.findElement(By.xpath(".//*[@id='gstno']")).sendKeys("07BKQFS");
		//q.findElement(By.id("CompanyName")).sendKeys("patanhi");
		//q.findElement(By.xpath(".//*[@id='home']/div[3]/section/div/div/form/div[12]/input")).click();
		
		
		//q.close();
	}

}
