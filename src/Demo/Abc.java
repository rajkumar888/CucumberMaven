package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



class Abc
{
	@Test
	void test(){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in");
   /* WebElement tb=driver.findElement(By.id("lst-ib")); 
    Actions build=new Actions(driver);*/
    
   
    driver.findElement(By.cssSelector("#gbw > div > div > div.gb_3d.gb_R.gb_bg.gb_3f > div:nth-child(2) > a")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
   /* build.moveToElement(tb)
    .contextClick(tb)
    .build().perform();*/
  
   // build.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
    
}
}

/*FirefoxProfile fp = new FirefoxProfile();
//set something on the profile...
DesiredCapabilities dc = DesiredCapabilities.firefox();
dc.setCapability(FirefoxDriver.PROFILE, fp);
WebDriver driver = new RemoteWebDriver(dc);


ChromeOptions options = new ChromeOptions();
//set some options
DesiredCapabilities dc = DesiredCapabilities.chrome();
dc.setCapability(ChromeOptions.CAPABILITY, options);
WebDriver driver = new RemoteWebDriver(dc);

*/
	