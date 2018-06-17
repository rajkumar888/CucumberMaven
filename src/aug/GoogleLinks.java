package aug;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\SOFTWARE\\Selenium\\geckodriver-v0.17.0-win64\\geckodriver.exe\\");

		// WebDriver driver = new FirefoxDriver();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement searchTextbox = driver.findElement(By.id("lst-ib"));

		searchTextbox.sendKeys("java", Keys.ENTER);

		Thread.sleep(2000);

		List<WebElement> links = driver.findElements(By.xpath("//a[contains(text(),'Java') or contains(text(),'java')]"));

		System.out.println("total link "+links.size());

		for (int i = 0; i < links.size(); i++) {
			Thread.sleep(2000);
			List<WebElement> links1 = driver.findElements(By.xpath("//a[contains(text(),'Java') or contains(text(),'java')]"));
			
			links1.get(i).click();
			System.out.println("link no "+i+1);
			System.out.println(driver.getTitle());
			driver.navigate().back();

		}

		driver.close();
	}

}
