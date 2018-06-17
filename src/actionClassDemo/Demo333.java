package actionClassDemo;

public class Demo333 {
	
	static {
		System.out.println("static block in parent");
	}

	{
		System.out.println("non static block in Parent");
	}
	
	Demo333()
	{
		System.out.println("Constructor in parent");
	}
	
	public static void m1()
	{
		System.out.println("static method in parent");
	}
	
	public void m2()
	{
		System.out.println("non static method in parent");
	}
}
