package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


// for click on new element in the child window or second window 
public class TestingScripts
{
public static void main(String []args) throws InterruptedException{
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("http://www.gmail.com");

String titleOfPage=driver.getTitle();
System.out.println(titleOfPage);

driver.findElement(By.linkText("Create account")).click();

driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();

/*Set<String> allWindowIds = driver.getWindowHandles();

Iterator<String> iterator = allWindowIds.iterator();
String parentWindowId = iterator.next();

String secondWindowId = iterator.next();

driver.switchTo().window(secondWindowId);
Thread.sleep(3000);
driver.switchTo().window(parentWindowId);
Thread.sleep(3000);
driver.switchTo().window(secondWindowId);
*/
System.out.println("-------------second window------------");
driver.findElement(By.xpath("html/body/div[2]/div[2]/section/div/article/section/div/div[3]/a")).click();
String textNameOnSecondWindow = driver.findElement(By.xpath("html/body/div[2]/div[2]/section/div/article/section/div/div[3]/a")).getText();
System.out.println(textNameOnSecondWindow);

driver.findElement(By.xpath("html/body/div[2]/div[2]/section/div/article/section/div/div[5]/a")).click();
textNameOnSecondWindow=driver.findElement(By.xpath("html/body/div[2]/div[2]/section/div/article/section/div/div[5]/a")).getText();
System.out.println(textNameOnSecondWindow);

}
}
