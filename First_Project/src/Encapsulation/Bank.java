package Encapsulation;

public class Bank {

	private int pin;
	
	void setPin(int pin)
	{
		this.pin=pin;
	}
	
	void validatePin()
	{
		if (pin==1001||pin==1234||pin==1212)
		{
			System.out.println("Pin is correct,Cash withdrawed successfully!! ");
		}
		else
		{ 
			System.out.println("Pin is incorrect,Please enter a valid pin!! ");
		}
	}
}
