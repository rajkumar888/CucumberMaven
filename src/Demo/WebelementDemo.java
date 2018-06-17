package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebelementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com");
	
	/*WebElement  we=  driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[1]/td[1]/label"));
	
	String str=we.getText();
	
	System.out.println(str);
	System.out.println(we.getText());
	
	System.out.println(driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[1]/td[1]/label")).getText());*/
	
	
/*	WebElement element= driver.findElement(By.xpath("//*[@id='email']"));
	
	element.sendKeys("783818");
	element.sendKeys("3320");
	
	
	
	WebElement passelement= driver.findElement(By.xpath("//*[@id='pass']"));
	
	passelement.sendKeys("123456789");
	
	String str1=element.getAttribute("value");
	String str2=element.getAttribute("class");
	String str3=element.getAttribute("data-testid");
	
	System.out.println(str1+" "+str2+" "+str3);*/
	
	
	
	
	
	}

}
