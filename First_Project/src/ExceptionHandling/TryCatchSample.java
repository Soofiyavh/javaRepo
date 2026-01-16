package ExceptionHandling;

public class TryCatchSample {

	public static void main(String[] args) {
		
		try {
		int a=10;
		int b=0;
		
		int result=a/b;
		
		System.out.println("The result is: "+result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cannoy divided by zero");
		}
		
		finally {
			System.out.println("Finally block is also known as cleanup block");
		}
	}

}
