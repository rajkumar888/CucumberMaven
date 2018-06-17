package com;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Demo
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static SimpleDateFormat htmlfolderFormat = new SimpleDateFormat("dd-MMM-yyyy") ;
	public static SimpleDateFormat htmlfileFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss") ;
	
	public static String htmlfolderName ;
	public static String htmlfileName ;
	public static long htmlfileNumber ;
	
	public static WebDriver driver;
	WebElement ca;
	Select sel;
	

	@BeforeClass
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "./library/chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("test-type");
		Options.addArguments("disable-infobars");
		Options.addArguments("start-maximized");
		Options.addArguments("--js-flags=--expose-gc");
		Options.addArguments("--enable-precise-memory-info");
		Options.addArguments("--disable-popup-blocking");
		Options.addArguments("--disable-default-apps");
		driver = new ChromeDriver(Options);
		/*System.setProperty("webdriver.gecko.driver", "./library/geckodriver.exe");
		driver= new FirefoxDriver();*/
		htmlfolderName=	htmlfolderFormat.format(new Date());
		htmlfileName=htmlfileFormat.format(new Date());
		htmlfileNumber=System.currentTimeMillis();
		
		String htmlfpath = System.getProperty("user.dir")+"/target/"+"Swm_cursory_reports_"+htmlfileName+htmlfileNumber + ".html";
		
		htmlReporter = new ExtentHtmlReporter(htmlfpath);
		
		extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("OS", "Windows 7");
		extent.setSystemInfo("Host Name", "Paritosh");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "Paritosh");
		
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("SWM_Cursory_Reports");
		htmlReporter.config().setReportName("SWM_Cursory_Reports");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
	}

	@Test
	public void tempLogin() throws Exception {
		
		test = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		driver.get("https://jcibts-swm-sb.jci.com/consumer-portal/#/login");
		
		screenshot();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		
		WebElement templogin = driver.findElement(By.cssSelector("#loginContainer > a"));
		
		act.moveToElement(templogin).click(templogin).build().perform();
		
		
		Thread.sleep(3000);
		screenshot();
		
		driver.findElement(By.cssSelector("#loginContainer > div > div > div > div > div.panel-body.row > div > form > input")).sendKeys("cphillry");
		screenshot();
		
		driver.findElement(By.cssSelector("#TemploginBtn")).click();
		screenshot();
		
		
		Thread.sleep(10000);
		WebElement activatelink = driver.findElement(By.xpath(".//*[contains(text(),'Activate')]"));
		act.moveToElement(activatelink).click(activatelink).build().perform();
		screenshot();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#orderNumber")).sendKeys("7638406");
		screenshot();
		
		driver.findElement(By.cssSelector("#activate > div:nth-child(3) > div > form.ng-valid.ng-valid-maxlength.ng-dirty.ng-valid-parse > button")).click();
		screenshot();
		
		validateActivate();
		
		driver.findElement(By.linkText("Welcome")).click();
		act.moveToElement(activatelink).click(activatelink).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#orderNumber")).sendKeys("e87b95bb-4cce-459c-b22f-e4568c9e5f7b");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		try {
			ca = driver.findElement(By.cssSelector("#activate > div:nth-child(4) > div > div.col-sm-11.col-md-11 > div > table > tbody > tr:nth-child(1) > td:nth-child(5) > div > select"));
			 validateActivate();
		} catch (Exception e) {

		}
		Thread.sleep(5000);
		WebElement deactivatelink = driver.findElement(By.xpath(".//*[contains(text(),'Deactivate')]"));
		act.moveToElement(deactivatelink).click(deactivatelink).build().perform();
		Thread.sleep(5000);
		
		
		WebElement ele=driver.findElement(By.cssSelector("#deactivate > div > div > div > div.col-md-6.col-sm-6 > select"));
		sel = new Select(ele);
		
		sel.selectByVisibleText("Start a New Offline Deactivation");
		driver.findElement(By.cssSelector("#system")).sendKeys("*1G3VKFLX2LM65FY 03");
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Welcome")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("My Tech Licenses")).click();
		Thread.sleep(25000);
		driver.findElement(By.cssSelector("#my-tech > div:nth-child(3) > div > div > button > span")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("»")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("»")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("»")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("TestcasesforLicenses")).click();
		
		driver.findElement(By.cssSelector("#my-tech > div:nth-child(7) > div > div > textarea")).sendKeys("Need this for testing");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		Thread.sleep(7000);
		driver.findElement(By.linkText("Welcome")).click();
		
		Thread.sleep(7000);
		driver.findElement(By.partialLinkText("All Software")).click();
		
		Thread.sleep(7000);
		driver.findElement(By.linkText("Welcome")).click();
		
	}
	public void validateActivate() throws Exception {
		
		ca = driver.findElement(By.cssSelector("#activate > div:nth-child(4) > div > div.col-sm-11.col-md-11 > div > table > tbody > tr:nth-child(1) > td:nth-child(5) > div > select"));
		sel = new Select(ca);
		sel.selectByVisibleText("View Product Key");
		screenshot();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//button/span[contains(text(),'Copy')]")).click();
		
		screenshot();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#dialogContent_0 > button:nth-child(2) > span")).click();
		screenshot();
		
		
		Thread.sleep(5000);
		sel.selectByVisibleText("Start a New Offline Activation");
		screenshot();
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button.md-primary.md-confirm-button.md-button.md-default-theme.md-ink-ripple > span")).click();
		
		Thread.sleep(5000);
		screenshot();
		
		
		driver.findElement(By.cssSelector("#system")).sendKeys("*1G3VKFLX2LM65FY");
		screenshot();
		driver.findElement(By.cssSelector("#activate > div:nth-child(6) > div > div > div > button.btn.btn-default.pull-right.ng-binding")).click();
		
		Thread.sleep(10000);
		screenshot();
		
		int count=driver.findElements(By.cssSelector("#activate > div:nth-child(8) > div:nth-child(3) > div.col-sm-10 > img")).size();
		
		if(count>0)
		{
			System.out.println("image loaded successfully "+ count);
		}
		else
		{
			System.out.println("image not loaded successfully "+ count);
		}
	}
	

	@AfterClass
	public void closing() throws Exception {
		
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("	#navmenu-Wrapper > ul > li.dropdown > a > span.ng-binding")).click();
		Thread.sleep(10000);
		screenshot();
		driver.findElement(By.cssSelector("#navmenu-Wrapper > ul > li.dropdown.open > ul > li:nth-child(3) > a")).click();
		Thread.sleep(5000);
		screenshot();
		extent.flush();
		//driver.close();
	}
	
	@AfterMethod
	public static void getResult(ITestResult result) throws Exception {
		
		if (result.getStatus() == ITestResult.FAILURE) 
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:", ExtentColor.RED));
			test.fail(result.getThrowable());

		} 
		
		else if (result.getStatus() == ITestResult.SUCCESS)
		{
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} 
		else 
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}

	
	public static void screenshot() throws Exception 
	{
			
		try {
			SimpleDateFormat fileName = new SimpleDateFormat("yyyy-MMM-dd HH-mm-ss") ;
			SimpleDateFormat folderName = new SimpleDateFormat("yyyy-MMM-dd") ;
			long fileno = System.currentTimeMillis();
			
			String fpath = System.getProperty("user.dir")+"/Screenshot/"+folderName.format(new Date())+"/Pic "+fileName.format(new Date())+" "+fileno + ".png";
			
			File dfile = new File(fpath);
			
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, dfile);
			
			test.addScreenCaptureFromPath(fpath);
			test.log(Status.INFO, MarkupHelper.createLabel(" successfully executed ", ExtentColor.GREEN));
			}
		
			catch (Exception e) {
			//e.printStackTrace(); 
				System.out.println("Exception occured during screenshot");
			}

			}
}
