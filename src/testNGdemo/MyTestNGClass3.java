package testNGdemo;

import org.testng.annotations.Test;

public class MyTestNGClass3 
{
   @Test(invocationCount = 10)
  public void test3() 
  { 
	  long id=Thread.currentThread().getId();
	  System.out.println("test 3 welcome to testng testing via xml and thread id is = "+id);
  }
 
   @Test(invocationCount = 10)
   public void test4() 
   { 
 	  long id=Thread.currentThread().getId();
 	  System.out.println("test 4 welcome to testng testing via xml and thread id is = "+id);
   }
   
   
   @Test(invocationCount = 10)
   public void test5() 
   { 
 	  long id=Thread.currentThread().getId();
 	  System.out.println("test 5 welcome to testng testing via xml and thread id is = "+id);
   }
   
   
   
  }



