package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;




	//4.How we can drag and drop element in selenium?
			  
			public class DragAndDropJabong {

			 public static void main(String[] args) throws InterruptedException {
				 
				 System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
				 
				 ChromeOptions options = new ChromeOptions();
				 options.addArguments("--disable-popup-blocking");
			     options.addArguments("--disable-save-password-bubble");
				 options.addArguments("disable-infobars");
			     options.addArguments("--disable-extensions");
			     options.addArguments("--disable-notifications");
			     options.addArguments("--start-maximized");
			     options.addArguments("--disable-web-security");
			     options.addArguments("--no-proxy-server");
			     options.addArguments("--enable-automation");
			     
			     Map<String, Object> prefs = new HashMap<String, Object>();
			     prefs.put("credentials_enable_service", false);
			     prefs.put("profile.password_manager_enabled", false);
			     options.setExperimentalOption("prefs", prefs);
			     
			     DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			     capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			     
			     WebDriver selenium = new ChromeDriver(capabilities);
				
			  
			     
			  //Opening the URL
			  selenium.get("http://www.jabong.com/clearance-sale");
			  
			  //Implicit wait for the browser to launch
			  selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  WebElement element= selenium.findElement(By.cssSelector("#mainTopNav > li.nav-women > a"));
			  
			  Actions action = new Actions(selenium);
			  action.moveToElement(element).perform();
			  
			  //Thread.sleep(4000); 	//selenium.quit();
			 }

			}


