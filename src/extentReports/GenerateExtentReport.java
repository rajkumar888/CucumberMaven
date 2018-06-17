package extentReports;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateExtentReport {
	ExtentReports extent;
	
	ExtentTest test;
	
	
	String htmlreportpath = System.getProperty("user.dir") + "/test-output/ER/" + System.currentTimeMillis()
			+ " MyOwnReport.html";
	//String configxmlpath = "C:\\workspace\\Selenium3.4\\extent-config.xml";
	
	String configxmlpath = "./extent-config.xml";
	
	@BeforeTest
	public void startReport() {
		extent = new ExtentReports(htmlreportpath, true);
		extent.addSystemInfo("Host Name","Rajkumar888")
		.addSystemInfo("Environment","QA")
		.addSystemInfo("User Name","Rajeev");

		extent.loadConfig(new File(configxmlpath)); // for report settings in
													// html format.
	}

	@Test
	public void demoReportPass() {
		test = extent.startTest("demoReportPass");
		Assert.assertTrue(true);
	}

	@Test
	public void demoReportFail() {
		test = extent.startTest("demoReportFail");
		Assert.assertTrue(false);
		}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Assert Fail as condition is False");
		} else {
			test.log(LogStatus.PASS, "Assert Pass as condition is True");
		}
		extent.endTest(test);
	}

	@AfterTest
	public void endreport() {
		extent.flush();
		extent.close();
		
		
	}
}