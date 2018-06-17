package testNGdemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;




public class MyTestNGClass {
	
	 @BeforeClass()
	 
	  public void test0000() {
		  long id=Thread.currentThread().getId();
		  System.out.println("@BeforeClass() before 222 welcome to testng testing via xml and thread id is = "+id);
	 }
		  
		  @AfterClass()
		  public void test1111() {
		  	  long id=Thread.currentThread().getId();
		  	  System.out.println(" @AfterClass() welcome to testng testing via xml and thread id is = "+id);
		  	
		  }

		
	  
	 
	  @BeforeSuite()
	  public void test888() {
		  long id=Thread.currentThread().getId();
		  System.out.println("@BeforeSuite() before 222 welcome to testng testing via xml and thread id is = "+id);
		
	  }
	  
	  @AfterSuite()
	  public void test999() {
		  long id=Thread.currentThread().getId();
		  System.out.println("@AfterSuite() welcome to testng testing via xml and thread id is = "+id);
		
	  }
	 
	@BeforeTest()
  public void test1() {
		WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.gmail.com");
	  long id=Thread.currentThread().getId();
	  
	  System.out.println("@BeforeTest before test 1 welcome to testng testing via xml and thread id is = "+id);
	   }
  
  
  @AfterTest()
  public void test2() {
	  long id=Thread.currentThread().getId();
	  System.out.println("@AfterTest() after test 2 welcome to testng testing via xml and thread id is = "+id);
	  //driver.quit();
  }
  
  
  @BeforeMethod()
  public void test222() {
	  long id=Thread.currentThread().getId();
	  System.out.println("@BeforeMethod() before 222 welcome to testng testing via xml and thread id is = "+id);
	
  }
  
  @AfterMethod()
  public void test3333() {
	  long id=Thread.currentThread().getId();
	  System.out.println("@AfterMethod() welcome to testng testing via xml and thread id is = "+id);
	
  }
  
 
  @Test(groups={"sanity"})
  public void test3() {
	  long id=Thread.currentThread().getId();
	  System.out.println("public void test3() test 3 welcome to testng testing via xml and thread id is = "+id);
  }
  
  @Test(groups={"integration"})
  public void test4() {
	  long id=Thread.currentThread().getId();
	  System.out.println(" public void test4() test 4 welcome to testng testing via xml and thread id is = "+id);
  }
  
	  @Test(groups={"sanity"})
	  public void test5() {
		  long id=Thread.currentThread().getId();
		  System.out.println("public void test5() test 5 welcome to testng testing via xml and thread id is = "+id);
	  }
	  
	  @Test(groups={"integration"})
	  public void test555() {
		  long id=Thread.currentThread().getId();
		  System.out.println(" test555() welcome to testng testing via xml and thread id is = "+id);
	  }
}

