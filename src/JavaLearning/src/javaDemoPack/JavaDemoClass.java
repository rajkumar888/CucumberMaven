package javaDemoPack;

class DemoJava{
	
	int x;
	
	char ch;
	
	String str;
	
	
	DemoJava()		// no parameter constructor or default 
	{
		x=500;
		ch='y';
		str="hello";
		
		System.out.println(" No parameter constructor invoked automatically ");
	}
	
	DemoJava(int x1, char ch1, String str1) // parameterized constructor
	{
		x=x1;
		ch=ch1;
		str=str1;
		System.out.println(" parameter constructor with 3 parameters invoked automatically ");
	}
	
	
	void display(){
		System.out.println(x);
		System.out.println(ch);
		System.out.println(str);
		
	}
	
	void update()
	{
		x=1000;
		ch='P';
		str="good night";
	}
	
	} // closing of class
	








public class JavaDemoClass {
	
	public static void main(String[] args) {
		
		// main method is the point where compiler of java starts the execution
		/*int x1=100, x2=200, x3=300;
		
		char ch='h';
		String str=" Hello welcome to java world ";
		
		System.out.println(x1 + " "+ x2 + " " + x3);
		//System.out.println(x2);
		//System.out.println(x3);
		
		System.out.println(x3+x2+x1+" "+ch+ " Nagraj" + str);*/
		
		
		DemoJava obj = new DemoJava();
		
		obj.display();
		
	/*	System.out.println(obj.x);
		System.out.println(obj.ch);
		System.out.println(obj.str);*/
						
						
						DemoJava obj2 = new DemoJava(800,'u', "Computer");	
						obj2.display();
						obj2.update();
						obj2.display();
						
						/*System.out.println(obj2.x);
						System.out.println(obj2.ch);
						System.out.println(obj2.str);*/
						
						
						
	} // closing of main method

}  // closing of class
