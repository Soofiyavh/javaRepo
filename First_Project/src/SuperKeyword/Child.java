package SuperKeyword;

public class Child extends Parent {

	Child()
	{
		super("Hai");
		
		
	}
	int y=200;
	public void show()
	{
		super.show();
		System.out.println("This is child show method"+y);
		System.out.println(super.x);
	}
	
	public static void main(String[] args) {

		Child c=new Child();
		c.show();

	}

}
