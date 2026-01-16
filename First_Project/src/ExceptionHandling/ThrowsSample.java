package ExceptionHandling;

public class ThrowsSample {

	static void divide(int a,int b) throws ArithmeticException
	{
		int r=a/b;
		System.out.println(r);
	}
	public static void main(String[] args) {

		try {
	      divide(10,0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Handled");
		}
	}

}
