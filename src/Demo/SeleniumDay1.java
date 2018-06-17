package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDay1 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		/*driver.get("https://www.paypal.com");
		driver.findElement(By.xpath("//*[@id='signup-button']")).click();
		
		try
		{
		driver.findElement(By.xpath("//*[@id='mpp-app-content']/section[1]/div/div/div/div[2]/div[3]/a")).click();
		}
		catch(Throwable t)
		{
			driver.findElement(By.xpath("//*[@id='get-started-carousel']/div/div[2]/div/label[2]/input")).click();
			driver.findElement(By.xpath("//*[@id='get-started-carousel']/div/div[2]/a")).click();
		}
        */
		
        driver.get("https://www.paypal.com/in/cgi-bin/webscr?cmd=_biz-signup-flow&nodeToClassic=yes");
		Select sel= new Select(driver.findElement(By.xpath("//*[@id='business_type']")));
		/*sel.selectByValue("6");		Thread.sleep(2000);
		sel.selectByValue("22");		Thread.sleep(2000);
		sel.selectByValue("4");Thread.sleep(2000);
		sel.selectByValue("3");Thread.sleep(2000);
		sel.selectByValue("2");Thread.sleep(2000);
		sel.selectByValue("0");
		*/
		
		sel.selectByIndex(0);Thread.sleep(2000);
		sel.selectByIndex(5);Thread.sleep(2000);
		sel.selectByIndex(4);Thread.sleep(2000);
		sel.selectByIndex(3);Thread.sleep(2000);
		sel.selectByIndex(2);Thread.sleep(2000);
		sel.selectByIndex(1);Thread.sleep(2000);
		sel.selectByIndex(0);Thread.sleep(2000);
		sel.selectByIndex(6);Thread.sleep(2000);
		
		/*<input id="business_name" class="large" type="text" value="" name="business_name" maxlength="63" size="25"/>
		driver.findElement(By.cssSelector("input[id=business_name] [class=large]")).sendKeys("hello test");
		*/
		//driver.findElement(By.xpath("//*[@id='business_type']")).sendKeys("Corporation");
		/*driver.findElement(By.xpath("//*[@id='business_name']")).sendKeys("Testbname");
		driver.findElement(By.xpath("//*[@id='business_address1']")).sendKeys("test add1");
		driver.findElement(By.xpath("//*[@id='business_address2']")).sendKeys("test address2");
		driver.findElement(By.xpath("//*[@id='business_city']")).sendKeys("test city");
		driver.findElement(By.xpath("//*[@id='business_state']")).sendKeys("Bihar");
		driver.findElement(By.xpath("//*[@id='business_zip']")).sendKeys("800016");
		driver.findElement(By.xpath("//*[@id='ccode']")).sendKeys("Euros");
		driver.findElement(By.xpath("//*[@id='industry']")).sendKeys("Education");
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='subindustry_1007']")));
		select.selectByVisibleText("Primary and secondary schools");
		
		Thread.sleep(3000);
		select.selectByIndex(1);
		
		Thread.sleep(3000);
		select.selectByValue("2075");
		
		driver.findElement(By.xpath("//*[@id='date_of_registration_dd']")).sendKeys("07");
		driver.findElement(By.xpath("//*[@id='date_of_registration_mm']")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id='date_of_registration_yyyy']")).sendKeys("2016");
		driver.findElement(By.xpath("//*[@id='business_url']")).sendKeys("www.paypal.com");
		driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Sudhanshu");
		driver.findElement(By.xpath("//*[@id='middle_initial']")).sendKeys("Rajeev");
		driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Ramashish");
		driver.findElement(By.xpath("//*[@id='dob_dd']")).sendKeys("07");
		driver.findElement(By.xpath("//*[@id='dob_mm']")).sendKeys("01");
		driver.findElement(By.xpath("//*[@id='dob_yyyy']")).sendKeys("1981");
		driver.findElement(By.xpath("//*[@id='citizenship']")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id='M_PhoneNumber']")).sendKeys("7838183320");
		driver.findElement(By.xpath("//*[@id='W_PhoneNumber']")).sendKeys("7279088838");
		driver.findElement(By.xpath("//*[@id='H_PhoneNumber']")).sendKeys("7279088838");
		driver.findElement(By.xpath("//*[@id='EditSMI']/fieldset[3]/div/label[2]")).click();
		driver.findElement(By.xpath("//*[@id='different_address']")).sendKeys("testing add1");
		driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("testing address2");
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Patna");
		driver.findElement(By.xpath("//*[@id='state']")).sendKeys("Bihar");
		driver.findElement(By.xpath("//*[@id='zip']")).sendKeys("800020");
		driver.findElement(By.xpath("//*[@id='tax_id']")).sendKeys("BGFPS0782K");
*/		//driver.findElement(By.xpath("//*[@id='EditSMI']/p[19]/input")).click();	
		
		/*.//a[id='signup-button']*/
   }
}


/*WebElement dropdown=driver.findElement(By.xpath("//*[@id='subindustry_1007']"));
Select selectdropdown= new Select(dropdown);
selectdropdown.selectByVisibleText("Primary and secondary schools");
selectdropdown.selectByIndex(3);
selectdropdown.selectByValue("2074");*/