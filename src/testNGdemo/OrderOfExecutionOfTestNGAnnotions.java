package testNGdemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfExecutionOfTestNGAnnotions {

	@BeforeGroups("functional")
	public void test9999() {
		long id=Thread.currentThread().getId();
		System.out.println("@BeforeGroups() functional welcome to testng testing via xml and thread id is = "+id);
	}
	
	@BeforeGroups("sanity")
	public void test8888() {
		long id=Thread.currentThread().getId();
		System.out.println("@BeforeGroups() sanity welcome to testng testing via xml and thread id is = "+id);
	}
	
	

	@BeforeClass()
	public void test0000() {
		long id=Thread.currentThread().getId();
		System.out.println("@BeforeClass() welcome to testng testing via xml and thread id is = "+id);
	}

	@BeforeSuite()
	public void test00002() {
		long id=Thread.currentThread().getId();
		System.out.println("@BeforeSuite()  welcome to testng testing via xml and thread id is = "+id);
	}

	@AfterClass()
	public void test1111() {
		long id=Thread.currentThread().getId();
		System.out.println("@AfterClass() welcome to testng testing via xml and thread id is = "+id);
	}

	@AfterSuite()
	public void test999() {
		long id=Thread.currentThread().getId();
		System.out.println("@AfterSuite() welcome to testng testing via xml and thread id is = "+id);
	}

	@BeforeTest()
	public void test1() {
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
		System.out.println("public void test3() welcome to testng testing via xml and thread id is = "+id);
	}

	@Test(groups={"functional"})
	public void test4() {
		long id=Thread.currentThread().getId();
		System.out.println("public void test4() welcome to testng testing via xml and thread id is = "+id);
	}
	
	@Test(groups={"functional"})
	public void test6() {
		long id=Thread.currentThread().getId();
		System.out.println("public void test6() welcome to testng testing via xml and thread id is = "+id);
	}

	@Test(groups={"sanity"})
	public void test5() {
		long id=Thread.currentThread().getId();
		System.out.println("public void test5() welcome to testng testing via xml and thread id is = "+id);
	}
	
		@Test()
		public void test7() {
			long id=Thread.currentThread().getId();
			System.out.println("public void test6() welcome to testng testing via xml and thread id is = "+id);
		}

		@Test()
		public void test8() {
			long id=Thread.currentThread().getId();
			System.out.println("public void test5() welcome to testng testing via xml and thread id is = "+id);
	}	 
}