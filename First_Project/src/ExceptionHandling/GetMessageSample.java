package ExceptionHandling;

public class GetMessageSample {

	public static void main(String[] args) {
		
		try {
			int a=3/0;
			System.out.println(a);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("The number can't "+ae.getMessage());
			System.out.println("printStackTrace is: ");
			ae.printStackTrace();
		}
	} 

}
