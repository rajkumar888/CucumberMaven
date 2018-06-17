package demo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggest {
	
	//public class Ajax_Handle {
	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				driver.get("http://www.google.com");
				driver.findElement(By.id("lst-ib")).sendKeys("how to");
				List <WebElement> allitems = driver.findElements(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li"));
					
				System.out.println(allitems.size());
				
				for(int i=0;i<allitems.size();i++)
				{
					String temp=allitems.get(i).getText();
					System.out.println(temp);
					
					if(temp.equalsIgnoreCase("how to kiss"))
					{
						allitems.get(i).click(); break;
						
					}
				}
	}
			}