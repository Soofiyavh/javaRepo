package Encapsulation;

public class User {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.setPin(1234);
		
		b.validatePin();

	}

}
