package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {

		// WebDriver driver = new FirefoxDriver();

		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/draggable/");

		WebElement frammevalue = driver.findElement(By.cssSelector("#content > iframe"));

		// driver.switchTo().frame(frammevalue);

		driver.switchTo().frame(0);

		WebElement drag = driver.findElement(By.cssSelector("#draggable > p"));

		System.out.println(drag.getText());

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("#sidebar > aside:nth-child(1) > ul > li:nth-child(2) > a")).click();

		driver.switchTo().frame(0);

		WebElement dragable = driver.findElement(By.xpath("//*[@id='draggable']/p"));

		WebElement dropable = driver.findElement(By.xpath("//*[@id='droppable']/p"));

		Actions act = new Actions(driver);

		act.dragAndDrop(dragable, dropable).perform();

	}

}
