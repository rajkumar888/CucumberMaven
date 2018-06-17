package testNGdemo;

import org.testng.annotations.Test;

public class MyTestNGClass2 {
	
	@Test(groups={"sanity"})
	public void abc1()
	{ long id=Thread.currentThread().getId();
		System.out.println("method abc1 thread id is = "+id);
		
		}
	
	@Test(groups={"sanity"})
	public void pqr1()
	{ long id=Thread.currentThread().getId();
		System.out.println("method pqr1 thread id is = "+id);
	
	}
	
	
	@Test(groups={"sanity"})
	public void bcd1()
	{ long id=Thread.currentThread().getId();
		System.out.println("method bcd1 thread id is = "+id);
	}
	

	@Test(groups={"integration"})
	public void xxx1()
	{ long id=Thread.currentThread().getId();
		System.out.println("method xxx1 thread id is = "+id);
	}
	
	@Test(groups={"integration"})
	public void yyy1()
	{ long id=Thread.currentThread().getId();
		System.out.println("method yyy1 thread id is = "+id);
	}
	
}	

	

