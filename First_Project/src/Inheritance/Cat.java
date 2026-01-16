package Inheritance;

public class Cat extends Animal {
	 int price= 1234;
	
	void eat()
	{
		System.out.println("cat starts eat");
	}

	public static void main(String[] args) {
		
		Cat c=new Cat();
		c.eat();
		System.out.println(c.price);
		c.sound();
		System.out.println(c.type);

	}

}
