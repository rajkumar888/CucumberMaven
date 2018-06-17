package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiTabHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		
		
		String Url[]= {"http://seleniumhq.org" ,"https://yahoo.com","http://www.shine.com","http://www.hcl.com"};

		//second tab
		 for (int i=0;i<4;i++){
		    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		    driver.navigate().to(Url[i]);
		 }

		 for(int i =0;i<=4;i++){
		    	Thread.sleep(2000);
		    	
		    	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,  Keys.TAB);
			
		    	
		    }
		   // To close the current tab.    
		   // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
		 
		    
			Thread.sleep(3000);
			driver.quit();
	}

}


/*  //third tab
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
//driver.navigate().to();


//fourth tab
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
//driver.navigate().to();


//move to very first tab.
driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord((Keys.CONTROL + "\t")));*/