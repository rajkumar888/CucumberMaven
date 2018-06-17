package myproject_clz;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Round_trip {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\new testing software\\new jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.jetstay.com");
		w.manage().window().maximize();
		w.findElement(By.xpath(".//*[@id='roundTrip']")).click();

		w.findElement(By.xpath(".//*[@id='flight_origin_rt']")).sendKeys("Goa, IN - Dabolim(GOI)");
		w.findElement(By.xpath(".//*[@id='flight_destination_rt']")).sendKeys("Chennai, IN - Chennai(MAA)");
		w.findElement(By.xpath(".//*[@id='flight_when_rt']")).sendKeys("30/04/2018");
		
		w.findElement(By.xpath(".//*[@id='flight_trip_length']")).sendKeys("06/06/2018");
		
		WebElement dropdown=w.findElement(By.xpath(".//*[@id='passengers_adults']"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("1");
		
		
		WebElement dropdown1=w.findElement(By.xpath(".//*[@id='passengers_children']"));
		Select s2=new Select(dropdown1);
		s2.selectByVisibleText("8");
		
		
		WebElement dropdown2=w.findElement(By.xpath(".//*[@id='passengers_infants']"));
		Select s3=new Select(dropdown2);
		s3.selectByVisibleText("0");
		
		WebElement dropdown3=w.findElement(By.xpath(".//*[@id='class_of_service']"));
		Select s4=new Select(dropdown3);
		s4.selectByVisibleText("First");
		
		// not working flight button
		//w.findElement(By.id("searchFlights")).click();
		//w.findElement(By.xpath(".//*[@id='searchFlights']")).click();
	}

}
