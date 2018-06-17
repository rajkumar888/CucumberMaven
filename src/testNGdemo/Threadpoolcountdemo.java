package testNGdemo;

import org.testng.annotations.Test;

public class Threadpoolcountdemo {
	
		@Test(threadPoolSize=5,invocationCount=20,timeOut=1000)
		public void testMethod(){
		Long id = Thread.currentThread().getId();
		System.out.println("Test method executing on thread with id: "+id);
		}
		}