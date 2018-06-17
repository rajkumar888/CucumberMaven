package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://www.cricbuzz.com/cricket-scorecard-archives/scorecard/10719");

		for(int i=3; i<14; i++)
		{
		for(int j=1; j<8; j++)
		{
		String tableText=driver.findElement(By.xpath("//*[@id='innings_2']/div[1]/div["+i+"]/div["+j+"]")).getText();
		System.out.print(tableText+" ");
		}

		System.out.println("");

		}

		
		
	}

}
