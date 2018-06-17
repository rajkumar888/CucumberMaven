package aug;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo2 {

	static FirefoxDriver driver;
		
	static Integer inter;
	
	int y;
	
	
	public static void main(String[] args) throws InterruptedException {

		
		System.out.println(inter);
		
		
		AlertDemo2 obj = new AlertDemo2();
		
		//System.out.println(obj.y);
		
		
		/*
		
		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\BrowserDriver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("file:///C:/Users/Lenovo/Desktop/alertdemopromptbox.html");
		
		
		driver.findElement(By.cssSelector("body > button")).click();
		
		Thread.sleep(2000);
		
		
		Alert al = driver.switchTo().alert();
		
		al.sendKeys("Hello i am into alert type box");
		
		System.out.println(al.getText());
		
		al.accept();
*/	}		

}
