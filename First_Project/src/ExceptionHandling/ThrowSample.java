package ExceptionHandling;

public class ThrowSample {

	public static void main(String args[])
	{
		int age=15;
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible"); //manually throw an exception
		}
		System.out.println("Eligible for vote");
		}
}
