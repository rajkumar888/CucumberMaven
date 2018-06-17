package WebDriverListenerDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EventListenerExample {
	
	private WebDriver driver;
	private EventFiringWebDriver e_driver;		
	// EventFiringWebDriver is a class ro register and unregister events
	
	private WebEventListener eventListener;		
	// WebEventListener is the name of class which has implemented WebDriverEventListener interface
	
	private WebDriverWait wait;
	
	private String appURL = "https://www.google.com";
	
	public int waitTime = 15;
	
	private String headerText = "Google";
	
	
	
	@BeforeClass()
	public void setUp() {
		// Initializing instance of Firefox WebDriver
				System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe" );
				driver = new FirefoxDriver();
				wait = new WebDriverWait(driver, waitTime);

				// Initializing EventFiringWebDriver using Firefox WebDriver instance
				e_driver = new EventFiringWebDriver(driver);

				// Now create object of EventListerHandler to register it with EventFiringWebDriver
				eventListener = new WebEventListener();

				e_driver.register(eventListener);
			
				e_driver.manage().window().maximize();
				e_driver.get(appURL);
				
				e_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	} // end of setup method in before class
	
	
	@Test
	public void testEventsONE() {
		System.out.println("***** Executing Test ONE ***** ");
		e_driver.findElement(By.linkText("Gmail")).click();
		Assert.assertEquals(headerText, e_driver.getTitle());
		}
	
	@Test
	public void testEventsTWO()  {
		System.out.println("***** Executing Test Two ***** ");
		//Entering user name and clicking on next
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
		e_driver.findElement(By.id("identifierId")).sendKeys("rajkumar888");
		e_driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		//Entering password and clicking on sign-in
		e_driver.findElement(By.name("password")).sendKeys("Soma@raju67");
		e_driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		}

	
	@AfterClass()
	public void tearDown() throws InterruptedException {
		if (e_driver != null) {
			Thread.sleep(3000);
			e_driver.quit();
			e_driver.unregister(eventListener);
			
		}
	}
}
