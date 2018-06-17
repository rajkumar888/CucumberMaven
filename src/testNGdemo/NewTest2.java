package testNGdemo;

import org.testng.annotations.Test;

public class NewTest2 {

	
		  @Test(groups={"sanity"})
		  public void test5() {
			  long id=Thread.currentThread().getId();
			  System.out.println("test 5 welcome to testng testing via xml and thread id is = "+id);
			 }
		  
		  
		  @Test(groups={"functional"})
		  public void test6() {
			  long id=Thread.currentThread().getId();
			  System.out.println("test 6 welcome to testng testing via xml and thread id is = "+id);
		  }
		  
		  @Test(groups={"sanity"})
		  public void test7() {
			  long id=Thread.currentThread().getId();
			  System.out.println("test 7 welcome to testng testing via xml and thread id is = "+id);
		  }
		  
		  @Test(groups={"functional"})
		  public void test8() {
			  long id=Thread.currentThread().getId();
			  System.out.println("test 8 welcome to testng testing via xml and thread id is = "+id);
		  }  
		}