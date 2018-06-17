package com.global.cursory;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
import org.testng.Assert;
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

public class GlobalLibrary
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
	int timemillisec=5000;
	int longwait=15000;
	List<WebElement> roleiconverify;
	List<WebElement> acceptdenybutton;
	
	public static SimpleDateFormat folderName = new SimpleDateFormat("yyyy-MMM-dd") ;
	public static SimpleDateFormat fileName = new SimpleDateFormat("yyyy-MMM-dd HH-mm-ss") ;
	public static String folder = folderName.format(new Date());
	public static String file = fileName.format(new Date());
	
	String creatoruser="creator@rajeshpanditjmtoutlook.onmicrosoft.com";;
	String moderatoruser="Moderator@rajeshpanditjmtoutlook.onmicrosoft.com";;
	String administratoruser="admin@rajeshpanditjmtoutlook.onmicrosoft.com";
	
	String creatorpass="Nov@2017";
	String moderatorpass="Dec@2017";
	String administratorpass="Sep@2017";

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
	public void test_GlobalLibrarycursory() throws Exception {
		
		test = extent.createTest(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		driver.get("http://mtld-ui.azurewebsites.net/");
		screenshot();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*// login with creator user
		loginUser(creatoruser,creatorpass);

		driver.findElement(By.cssSelector("#dLabel > span")).click();
		Thread.sleep(timemillisec);	screenshot();
		
		List<WebElement> iconlist = driver.findElements(By.xpath("//*[@id='wrapper']/home-cmp/div/div[4]/add-cafnavigation/div/div/div/div[1]/ul/span[1]/div/div/ul/li/div"));
		Assert.assertEquals(iconlist.get(0).getText().trim(), "Administrator", "verified");
		Assert.assertEquals(iconlist.get(1).getText().trim(), "Moderator", "verified");
		Thread.sleep(longwait); screenshot();
		
		
		driver.findElement(By.cssSelector("#wrapper > home-cmp > div > div.portlet-body > add-cafnavigation > div > div > div > div.portlet-title > ul > span.pull-right.rolechangebtn > div > div > ul > li > div:nth-child(2)")).click();
		Thread.sleep(longwait); screenshot();
		
		
		logoutUser();
		
		//login to application with administrator login credentials
		driver.findElement(By.cssSelector("#i0116")).sendKeys("admin@rajeshpanditjmtoutlook.onmicrosoft.com");
		Thread.sleep(timemillisec); screenshot();
		
		driver.findElement(By.cssSelector("#idSIButton9")).click();
		Thread.sleep(timemillisec);	screenshot();
		
		
		driver.findElement(By.cssSelector("#i0118")).sendKeys("Sep@2017");
		Thread.sleep(timemillisec);	screenshot();
		
		driver.findElement(By.cssSelector("#idSIButton9")).click();
		Thread.sleep(timemillisec);	screenshot();
		
		roleiconverify= driver.findElements(By.cssSelector("#wrapper > home-cmp > div > div.portlet-body > add-cafnavigation > div > div > div > div.portlet-title > ul > span.pull-right.countinfo > a > span.countNo"));
		// verify that role request approval is visible
		//Assert.assertEquals(roleiconverify.size(), 1);
		
		
		logoutUser();
				*/
				//login to application with Moderator login credentials
			loginUser(moderatoruser,moderatorpass);
				
				
				roleiconverify = driver.findElements(By.cssSelector("#wrapper > home-cmp > div > div.portlet-body > add-cafnavigation > div > div > div > div.portlet-title > ul > span.pull-right.countinfo > a > span.countNo"));
				// verify that role request approval is not visible
				//Assert.assertEquals(roleiconverify.size(), 0);
				Thread.sleep(timemillisec);	screenshot();
				
				logoutModeratorUser();
				
				
				loginUser(moderatoruser,moderatorpass);
				
				// click on small down arrow to raise a role request
				driver.findElement(By.cssSelector("#dLabel > span")).click();
				Thread.sleep(timemillisec);	screenshot();
				
				// click on administrator link
				driver.findElement(By.cssSelector("#wrapper > home-cmp > div > div.portlet-body > add-cafnavigation > div > div > div > div.portlet-title > ul > span.pull-right.rolechangebtn > div > div > ul > li > div:nth-child(1)")).click();
				Thread.sleep(longwait);	screenshot();
				
				
				// click on small down arrow to raise a role request
				driver.findElement(By.cssSelector("#dLabel > span")).click();
				Thread.sleep(timemillisec);	screenshot();
				
				// click on moderator link
				driver.findElement(By.cssSelector("#wrapper > home-cmp > div > div.portlet-body > add-cafnavigation > div > div > div > div.portlet-title > ul > span.pull-right.rolechangebtn > div > div > ul > li > div:nth-child(1)")).click();
				Thread.sleep(longwait);	screenshot();
				
				logoutModeratorUser();
				
				
				//login to application with administrator login credentials
				loginUser(administratoruser,administratorpass);
				
				driver.findElement(By.cssSelector("#wrapper > home-cmp > div > div.portlet-body > add-cafnavigation > div > div > div > div.portlet-title > ul > span.pull-right.countinfo > a > i.fa.fa-user.fa-3x")).click();
				Thread.sleep(timemillisec);	screenshot();
				
				// approve code
				driver.findElement(By.cssSelector("#accept > span")).click();
				Thread.sleep(timemillisec);	screenshot();
							
				// deny code
				//driver.findElement(By.cssSelector("#accept")).click();
				//Thread.sleep(timemillisec);	screenshot();
				
				
				acceptdenybutton = driver.findElements(By.cssSelector("#accept > span"));
				// verify that role request approval is not visible
				//Assert.assertEquals(acceptdenybutton.size(), 0);
				Thread.sleep(timemillisec);	screenshot();
				
				logoutUser();
				
				
				// login with creator user
				loginUser(creatoruser,creatorpass);
				Thread.sleep(timemillisec);	screenshot();
				WebElement we = driver.findElement(By.cssSelector("#wrapper > home-cmp > div > div.portlet-body > add-cafnavigation > div > div > div > div.messagealert.alert.alert-success.RoleNotificationDenied > span"));
				we.click();
				Thread.sleep(timemillisec);	screenshot();
				
				String exp="The request for change of role";
				
				//verify the popup message
				Assert.assertEquals(we.getText().contains(exp), exp);
				
				
				// close the popup message
				driver.findElement(By.cssSelector("#wrapper > home-cmp > div > div.portlet-body > add-cafnavigation > div > div > div > div.messagealert.alert.alert-success.RoleNotificationDenied > a")).click();

				//verify the role of user
				driver.findElement(By.cssSelector("#dLabel > span")).click();
				Thread.sleep(timemillisec);	screenshot();
				
				List<WebElement> iconlist1 = driver.findElements(By.xpath("//*[@id='wrapper']/home-cmp/div/div[4]/add-cafnavigation/div/div/div/div[1]/ul/span[1]/div/div/ul/li/div"));
				Assert.assertEquals(iconlist1.get(0).getText().trim(), "Administrator", "verified");
				Thread.sleep(longwait); screenshot();
				
				logoutUser();
				
				// login with creator user
				loginUser(creatoruser,creatorpass);
				Thread.sleep(timemillisec);	screenshot();
				
				// navigate to caf files section
				driver.findElement(By.cssSelector("#MainMenu > div > a:nth-child(2)")).click();
				
				
				Thread.sleep(timemillisec);	screenshot();
				
				//click on down arrow icon 
				driver.findElement(By.cssSelector("#accordion > div.panel.panel-default > div > div.homebox > h4 > a")).click();
				Thread.sleep(timemillisec);	screenshot();
				
				// click on file upload icon
				driver.findElement(By.cssSelector("#accordion > div:nth-child(2) > add-cafnavigation > div > div > div > div:nth-child(2) > document-filter-grid > div.homepagesort > div > form > div > div.col-lg-7.col-md-5.col-xs-4.text-right.MyFilesTab > i.fa.fa-cloud-upload")).click();
				Thread.sleep(timemillisec);	screenshot();
				
				// click on browse1 and upload
				driver.findElement(By.cssSelector("#accordion > div:nth-child(2) > add-cafnavigation > div > div > div > div:nth-child(2) > document-filter-grid > div:nth-child(4) > upload-document > div.modalpopup.uploaddocumentPopup > div > div > div.modal-body > div > div.col-md-6.col-sm-6.uploaddocumentcontent > form > div:nth-child(2) > div > div > div > div > label > span > input")).sendKeys("C:\\Users\\Lenovo\\Desktop\\Raj.JPG");
				Thread.sleep(timemillisec);	screenshot();
				
				// click on browse2 and upload
				driver.findElement(By.cssSelector("#accordion > div:nth-child(2) > add-cafnavigation > div > div > div > div:nth-child(2) > document-filter-grid > div:nth-child(4) > upload-document > div.modalpopup.uploaddocumentPopup > div > div > div.modal-body > div > div:nth-child(2) > form > div.form-group.martop45 > div > div > div > label > span > input")).sendKeys("C:\\Users\\Lenovo\\Desktop\\Raj.JPG");
				Thread.sleep(timemillisec);	screenshot();
				
				// branch drop down
				Select sel1 = new Select(driver.findElement(By.cssSelector("#accordion > div:nth-child(2) > add-cafnavigation > div > div > div > div:nth-child(2) > document-filter-grid > div:nth-child(4) > upload-document > div.modalpopup.uploaddocumentPopup > div > div > div.modal-body > geography-location > div > div > div > div:nth-child(4) > div > form > div > div > select")));
				sel1.selectByVisibleText("Jakarta");
				Thread.sleep(timemillisec);	screenshot();
				
				// vertical market drop down
				Select sel2 = new Select(driver.findElement(By.cssSelector("#accordion > div:nth-child(2) > add-cafnavigation > div > div > div > div:nth-child(2) > document-filter-grid > div:nth-child(4) > upload-document > div.modalpopup.uploaddocumentPopup > div > div > div.modal-body > div > div:nth-child(2) > form > div:nth-child(4) > div > div > select")));
				sel2.selectByVisibleText("Hotel");
				Thread.sleep(timemillisec);	screenshot();

				// engineering firm drop down
				Select sel3 = new Select(driver.findElement(By.cssSelector("#accordion > div:nth-child(2) > add-cafnavigation > div > div > div > div:nth-child(2) > document-filter-grid > div:nth-child(4) > upload-document > div.modalpopup.uploaddocumentPopup > div > div > div.modal-body > div > div:nth-child(2) > form > div:nth-child(5) > div > div > select")));
				sel3.selectByVisibleText("Arup");
				Thread.sleep(timemillisec);	screenshot();

				
				// input demo document title
				driver.findElement(By.cssSelector("#accordion > div:nth-child(2) > add-cafnavigation > div > div > div > div:nth-child(2) > document-filter-grid > div:nth-child(4) > upload-document > div.modalpopup.uploaddocumentPopup > div > div > div.modal-body > div > div.col-md-6.col-sm-6.uploaddocumentcontent > form > div:nth-child(5) > div > div > input")).sendKeys("demo document titles");
				Thread.sleep(timemillisec);	screenshot();
				
				// input some value in demo sequence field
				driver.findElement(By.cssSelector("#textAreaContent > div.note-editable.panel-body")).sendKeys("demo sequence of operation");
				Thread.sleep(timemillisec);	screenshot();
				
				
				//click on upload button
				driver.findElement(By.cssSelector("#accordion > div:nth-child(2) > add-cafnavigation > div > div > div > div:nth-child(2) > document-filter-grid > div:nth-child(4) > upload-document > div.modalpopup.uploaddocumentPopup > div > div > div.modal-footer > input:nth-child(2)")).click();
				Thread.sleep(timemillisec);	screenshot();
				
}

	public void loginUser(String username, String password) throws InterruptedException, Exception {
		//login to application with creator login credentials
		driver.findElement(By.cssSelector("#i0116")).sendKeys(username);
		Thread.sleep(timemillisec);	screenshot();
		
		driver.findElement(By.cssSelector("#idSIButton9")).click();
		Thread.sleep(timemillisec);	screenshot();
		
		driver.findElement(By.cssSelector("#i0118")).sendKeys(password);
		Thread.sleep(timemillisec);		screenshot();
		
		
		driver.findElement(By.cssSelector("#idSIButton9")).click();
		Thread.sleep(timemillisec);		screenshot();
		
		if(driver.findElements(By.cssSelector("#idSIButton9")).size()>0)
		{
			driver.findElement(By.cssSelector("#idSIButton9")).click();
			Thread.sleep(timemillisec);	screenshot();

		}
		
	}

	public void logoutUser() throws InterruptedException, Exception {
		// logout script for Moderator
		driver.findElement(By.cssSelector("#dropdownMenu1")).click();
		Thread.sleep(timemillisec); screenshot();
		
		driver.findElement(By.cssSelector("#wrapper > navbar-cmp > header > ul > li > ul > li:nth-child(3) > a")).click();
		Thread.sleep(timemillisec); screenshot();
		
		driver.findElement(By.cssSelector("#otherTileText")).click();
		Thread.sleep(timemillisec); screenshot();
	}
	
	
	public void logoutModeratorUser() throws InterruptedException, Exception {
		// logout script for Moderator
		driver.findElement(By.cssSelector("#dropdownMenu1")).click();
		Thread.sleep(timemillisec); screenshot();
		
		driver.findElement(By.cssSelector("#wrapper > navbar-cmp > header > ul > li.dropdown.open > ul > li:nth-child(3) > a")).click();
		Thread.sleep(timemillisec); screenshot();
		
		driver.findElement(By.cssSelector("#otherTileText")).click();
		Thread.sleep(timemillisec); screenshot();
	}

//	
//	@AfterMethod
//	public static void getResult(ITestResult result) throws Exception {
//		
//		if (result.getStatus() == ITestResult.FAILURE) 
//		{
//			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:", ExtentColor.RED));
//			test.fail(result.getThrowable());
//		} 
//		
//		else if (result.getStatus() == ITestResult.SUCCESS)
//		{
//		test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
//		} 
//		else 
//		{
//			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
//			test.skip(result.getThrowable());
//		}

//Actions act = new Actions(driver);
//	@AfterClass
//	public void closing() throws Exception {
//		
//		Thread.sleep(10000);
//		driver.findElement(By.cssSelector("	#navmenu-Wrapper > ul > li.dropdown > a > span.ng-binding")).click();
//		Thread.sleep(10000);
//		screenshot();
//		driver.findElement(By.cssSelector("#navmenu-Wrapper > ul > li.dropdown.open > ul > li:nth-child(3) > a")).click();
//		Thread.sleep(5000);
//		screenshot();
//		extent.flush();
//		//driver.close();
//	}
	
	public static void screenshot() throws Exception 
	{
		try {
			
			long fileno = System.currentTimeMillis();
			
			String fpath = System.getProperty("user.dir")+"/Screenshot/"+folder+"/Pic_"+file+"_"+fileno + ".png";
			
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
