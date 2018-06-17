package m1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestHello {

	
	@Test
	public void demo1() {
		System.out.println("hello i am in demo 1");

		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("environment"));
		Assert.assertEquals(true, true);
		
		System.out.println("hello i am in demo 1");
		System.out.println("hello i am in demo 1");
		System.out.println("hello i am in demo 1");
		System.out.println("hello i am in demo 1");
		System.out.println("hello i am in demo 1");
		
	}

}
