package Abstraction;

public class AbstractTest {

	public static void main(String[] args) {
		Vehicle v=new Car();        //up-casting , we can't create object of abstract classes
		
		v.start();
		v.fuelType();
	}

}
