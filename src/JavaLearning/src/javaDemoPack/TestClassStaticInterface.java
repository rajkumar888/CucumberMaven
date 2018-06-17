package javaDemoPack;

public class TestClassStaticInterface implements TestDemoStatic {

	@Override
	public void normalfunction() {
		System.out.println(" normal method call in class of interface ");
		
	}

	public static void main(String[] args)
	{
		//TestDemoStatic.staticfunction2();
		TestDemoStatic obj = new TestClassStaticInterface();
		obj.defaultfunction3();
		obj.normalfunction();
	}	
}