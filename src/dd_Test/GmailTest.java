package dd_Test;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import dd_Core.CoreTest;

public class GmailTest extends CoreTest{
	
	Logger log = Logger.getLogger("devpinoyLogger");
	
	@Test
	public void loginGmail(){
		
		
		//opning gmail app
		driver.get(config.getProperty("url"));
		log.debug("Opening Gmail Application");
		//entering email Id
		driver.findElement(By.xpath(object.getProperty("userId"))).sendKeys(excel.getCellData("LoginTest", 0, 2));
		log.debug("Entering User Id");
		
		//clicking on next button
		driver.findElement(By.xpath(object.getProperty("next"))).click();
		log.debug("Clicking on Next Button");
		
		
		//entering passwd
		driver.findElement(By.xpath(object.getProperty("passWord"))).sendKeys(excel.getCellData("LoginTest", 1, 2));
		log.debug("Entering Password");
		
		//clickning sign in
		driver.findElement(By.xpath(object.getProperty("signIn"))).click();
		log.debug("Clicking on Sing up button");
	}

}
