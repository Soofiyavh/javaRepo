package Interface;

public class Printer implements Printable,Scannable{

	public void print()
	{
		System.out.println("Printing document");
	}

	public void scan()
	{
		System.out.println("Scanning document");
	}
	public static void main(String[] args) {
		
		Printer p=new Printer();
		
		p.print();
		p.scan();
}
}
