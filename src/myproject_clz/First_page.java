package myproject_clz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First_page {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\new testing software\\new jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		w.get("https://www.jetstay.com");

		w.manage().window().maximize();
		
		w.findElement(By.xpath(".//*[@id='singleTrip']")).click();
		w.findElement(By.id("flight_origin")).sendKeys("Chennai, IN - Chennai(MAA)");
		w.findElement(By.id("flight_destination")).sendKeys("Hyderabad, IN - Shamsabad International Airport(HYD)");
		w.findElement(By.id("flight_when")).clear();
		w.findElement(By.id("flight_when")).sendKeys("25/05/2018");
		
		WebElement w1= w.findElement(By.id("passengers_adults"));
		org.openqa.selenium.support.ui.Select s= new org.openqa.selenium.support.ui.Select(w1);
		s.selectByValue("8");
		
		WebElement w2=w.findElement(By.id("passengers_children"));
		Select s1= new Select(w2);
		s1.selectByVisibleText("1");
		
		
		WebElement w3=w.findElement(By.id("passengers_infants"));
		Select s2=new Select(w3);
		s2.selectByIndex(3);
		
		WebElement w4=w.findElement(By.id("class_of_service"));
		Select s3= new Select(w4);
		s3.selectByValue("4");
		
		w.findElement(By.id("searchFlights")).click();
		
		//w.findElement(By.xpath(".//*[@id='searchFlights']")).click();
		//w.findElement(By.id("searchFlights")).click();
		//w.close();
	}

}
