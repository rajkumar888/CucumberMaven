package actionClassDemo;

public class Demo334 extends Demo333 {

	static {
		System.out.println("static block in Child");
	}

	{
		System.out.println("non static block in Child");
	}

	Demo334() {
		System.out.println("Constructor in Child");
	}

	public static void m1() {
		System.out.println("static method in child");
	}

	public void m2() {
		System.out.println("non static method in child");
	}

	public static void main(String[] args) {
		Demo333 obj = new Demo334();
	
	}
}
