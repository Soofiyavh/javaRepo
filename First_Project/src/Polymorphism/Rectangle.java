package Polymorphism;

public class Rectangle extends Shape {

	//method over-riding
	void draw()
	{
		System.out.println("Drawing a rectangle");
	}
	
	public static void main(String[] args) {
		Shape s=new Shape();
		Shape s1=new Circle();     //up-casting
		Shape s2=new Rectangle();  //up-casting
		
		s.draw();
		s1.draw();
		s2.draw();

	}

}
