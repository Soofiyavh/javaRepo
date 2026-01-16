package SuperKeyword;

public class Parent {

	int x=100;
	Parent()
	{
		//this("Hai");
		System.out.println("This is no argument Constructor");
	}
	Parent(String s)
	{
		this();
		System.out.println("This is argument constuctor");
	}
	public void show()
	{
		System.out.println("This is parent show method");
		
	}
}
