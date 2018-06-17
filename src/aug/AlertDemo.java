package aug;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	static FirefoxDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\BrowserDriver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("file:///C:/Users/Lenovo/Desktop/n1.html");

		driver.findElement(By.cssSelector("body > button")).click();
		
		Thread.sleep(2000);
		//file:///C:/Users/Lenovo/Desktop/Alert/alertdemopromptbox.html
		
		Alert al = driver.switchTo().alert();
		
		//al.dismiss();	// click on cancel button on alert
//		.accept();  // click on ok button on alert

		String exp= "Press a button!";
		
		
		String act= al.getText();
		
		System.out.println(act);
		
		if(act.equals(exp))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
	}		

}
