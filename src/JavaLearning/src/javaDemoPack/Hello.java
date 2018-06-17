package javaDemoPack;

public class Hello {

	
				static int count=0;//will get memory only once and retain its value 
				
				public Hello()
				{
					count = 500;
					  System.out.println(count);
				  
				}
			  
				public void change()
				{
					count = 800;
					  System.out.println(count);
				  
				}
		
				  public static void main(String args[])
				  {  
				  
				  System.out.println("Hello main");
				  Hello h= new Hello();
			
				  h.change();
				  
				 } 
				  	static{
				  		
				  		System.out.println(count);
				  		count = 100;
					  System.out.println("static block is invoked");
						System.out.println(count);
					  }
				}
