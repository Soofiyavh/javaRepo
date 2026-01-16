package ExceptionHandling;

public class ExceptionSample {

	public static void main(String[] args) {
		
		try{
		
		int a[]= {10,20,30,40};
		 
		 System.out.println(a[5]);
		 
		 int b=10/0;
		 System.out.println(b);
		 
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occured");
		}
		
		catch(ArrayIndexOutOfBoundsException ee)
		{
			System.out.println("ArrayIndexOutOfBoundsEcxception occured");
		}
	}

}
