package Polymorphism;

public class Onseason {

	public void discount(int price)
	{
		double dis=price*0.4;
		double finalamount=price-dis;
		
		System.out.println("The amount payable after discount is: "+finalamount);
	}
}
