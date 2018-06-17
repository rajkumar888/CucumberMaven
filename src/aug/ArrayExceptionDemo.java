package aug;

public class ArrayExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		int[] arr= {10,20,30,40,50};
		
		
		Thread.sleep(1000);
		
		try {
			System.out.println(arr[3]);
		
		} 
		
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			//e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException exception of the program");
		}
		
		
		catch (ArithmeticException e) {
			
			//e.printStackTrace();
			System.out.println("arithmetic exception of the program");
		}
		catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("some exception of the program");
		}
		
		
		
		System.out.println("end of the program");
	}

}
