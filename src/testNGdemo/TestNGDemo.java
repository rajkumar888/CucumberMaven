package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {

	

		@Test()
		public void abc()
		{
			System.out.println("@Test() method abc");
			Assert.assertEquals("ram", "ram1");
			System.out.println("@Test() method after assert in abc");
		}
		
		@Test()
		public void pqr()
		{
			System.out.println("@Test() method pqr");
		}
		
		
		@Test()
		public void bcd()
		{
			System.out.println("@Test() method bcd");
		}
		

		@Test()
		public void xxx()
		{
			System.out.println("@Test() method xxx");
		}
		
		@Test()
		public void yyy()
		{
			System.out.println("@Test() method yyy");
		}
		
		@Test()
		  public void test1() {
			  long id=Thread.currentThread().getId();
			  
			  System.out.println("@Test() test 1 welcome to testng testing via xml and thread id is = "+id);
			   }
		  
		  
		  @Test()
		  public void test2() {
			  long id=Thread.currentThread().getId();
			  System.out.println("@Test() test 2 welcome to testng testing via xml and thread id is = "+id);
		  }
		  
		  @Test()
		  public void test3() {
			  long id=Thread.currentThread().getId();
			  System.out.println("@Test() test 3 welcome to testng testing via xml and thread id is = "+id);
		  }
		  
		  @Test()
		  public void test4() {
			  long id=Thread.currentThread().getId();
			  System.out.println("@Test() test 4 welcome to testng testing via xml and thread id is = "+id);
		}
	}
	

