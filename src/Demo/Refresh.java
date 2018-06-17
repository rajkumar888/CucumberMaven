package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Refresh {

			//Counter Variable
			static int iCnt =1;
			

			public static void main(String[] args) {
			 WebDriver driver = new FirefoxDriver();

			 System.out.println("Launching Browser");
			 //Opening the URL
			 
			 driver.get("http://www.uftHelp.com");
			 //Refresh the browser Using 'Refresh' command
			 
			 driver.navigate().refresh();
			 System.out.println("Approach"+increment()+": Refreshed browser using 'Refresh'command");
			 
			 //Refresh the browser Using 'Get' command
			 driver.get(driver.getCurrentUrl());
			 System.out.println("Approach"+increment()+": Refreshed browser using 'GetCurrentUrl' Command");
			 
			 //Refresh using Navigate and Get 
			 driver.navigate().to(driver.getCurrentUrl());
			 System.out.println("Approach"+increment()+": Refreshed browser using 'To' Command");
			 
			 //Refresh me using SendKeys
			 //Adding Explicit wait so that element is visible before action can be taken 
			 //otherwise it will show nosuchelementexception
			 
			 WebDriverWait wait = new WebDriverWait(driver, 10);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contact-Us")));
			 driver.findElement(By.id("contact-Us")).sendKeys(Keys.F5);
			 
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contact-Us")));
			 System.out.println("Approach"+increment()+": Refreshed browser using 'Keys'command");
			 driver.findElement(By.id("contact-Us")).sendKeys("\uE035"); 
			 System.out.println("Approach4: Refreshed browser using 'Ascii' value");
			 
			 //Using ExecuteScript 
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("history.go(0)");
			 System.out.println("Approach"+increment()+": Refreshed browser using 'ExecuteScript' Command");
			 //Closing the browser window using Quit method
			 //driver.quit();
			}
			//Function to increment the counter
			public static int increment()
			 {
			  return iCnt++;
			 }
			
			}

