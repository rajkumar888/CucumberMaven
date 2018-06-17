package demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendartesting {

	    public static void main(String[] args) throws InterruptedException 
	    {
	        WebDriver driver = new FirefoxDriver();
	       
	        driver.get("http://www.makemytrip.com/");
	        
	        // how to minimize the window
	        driver.manage().window().setPosition(new Point(-2000, 0));
	        
	        
	        Thread.sleep(3000);
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        driver.quit();
	        
	    }
	}

