package demoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetattributDemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:/Driver/geckodriver.exe");

		FirefoxDriver ffd = new FirefoxDriver();

		ffd.get("https://www.facebook.com");


		System.out.println(ffd.findElement(By.xpath("//input[@id='u_0_1']")).getAttribute("aria-label"));



		// this will return the value of the attribute given in parameter
		ffd.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("Hello facebook");

		System.out.println(ffd.findElement(By.xpath("//input[@id='u_0_1']")).getAttribute("value"));



	String url=	ffd.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).getAttribute("href");
		// this will give the url associated with the webelement
	
	System.out.println(url);
	
	String exp="https://www.facebook.com/recover/initiate?lwv=110";
	
	if(exp.equals(url))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
		
	}

}
