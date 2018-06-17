package demoSelenium;


	
	
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;		
	import org.openqa.selenium.By;		
	import org.openqa.selenium.NoAlertPresentException;		
	import org.openqa.selenium.WebDriver;		
	import org.openqa.selenium.firefox.FirefoxDriver;		

	public class AlertDemo {			
	        		
	        public static void main(String[] args) throws InterruptedException {									
	            WebDriver driver = new FirefoxDriver();			
	            		
	            // Alert Message handling
	                        		
	            driver.get("http://demo.guru99.com/V4/");	
	            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	                                		
	            driver.findElement(By.name("uid")).sendKeys("mngr30127");					
	            driver.findElement(By.name("password")).sendKeys("EzAtAqy");					
	            driver.findElement(By.name("btnLogin")).submit();
	            
	                    
	            Thread.sleep(2000);
	           
	            if(driver.switchTo().alert()!=null)
	            System.out.println("Alert found");	
	            // Capturing alert message.    
	            
	            		
	            // Displaying alert message		
	            System.out.println(driver.switchTo().alert().getText());			
	            		
	            // Accepting alert		
	            driver.switchTo().alert().accept();	
	            
	            }    		
	        }

