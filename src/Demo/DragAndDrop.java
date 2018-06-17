package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




	//4.How we can drag and drop element in selenium?
			  
			public class DragAndDrop {

			 public static void main(String[] args) throws InterruptedException {
			  
				 
			  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			  WebDriver selenium = new ChromeDriver();
			  System.out.println("Launching Browser");
			  
			  //Opening the URL
			  selenium.get("http://jqueryui.com/resources/demos/droppable/default.html");
			  
			  //Implicit wait for the browser to launch
			  selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  //Identifying the elements to perform action 
			  WebElement draggable = selenium.findElement(By.xpath("//*[@id='draggable']"));
			  WebElement droppable = selenium.findElement(By.xpath("//*[@id='droppable']"));
			  
			  Actions oAction = new Actions(selenium);
			  Thread.sleep(4000);
			  
			  //Performing Drag and Drop operation 
			  oAction.dragAndDrop(draggable, droppable).perform();
			  
			  //System.out.println("Successfully completed the Drag-Drop operation");
			  
			  /*selenium.get("http://jqueryui.com/resources/demos/slider/default.html");
			  
			
			  WebElement slider = selenium.findElement(By.xpath("//*[@id='slider']/span"));
			  WebElement sliderbar = selenium.findElement(By.xpath("//*[@id='slider']"));
			  Actions oAction = new Actions(selenium);
			  Thread.sleep(4000);
			  oAction.clickAndHold(slider);
			  oAction.moveToElement(sliderbar, 800, 500);
			  oAction.release().perform();*/
			  Thread.sleep(4000); 	selenium.quit();
			 }

			}


