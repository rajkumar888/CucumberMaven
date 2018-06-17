package javaDemoPack;

public interface TestDemoStatic {
	static int x=100;
	final int y=200;
	
	void normalfunction();
	
	static void staticfunction2() {
		
		System.out.println("static method call ");
		System.out.println(" value of x and value of y "+x+" "+y);
	}

	default void defaultfunction3()
	{
		System.out.println("default method call ");
	}
	
	
}
	
	
