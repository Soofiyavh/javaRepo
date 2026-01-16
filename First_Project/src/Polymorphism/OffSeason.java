package Polymorphism;

public class OffSeason {

	public void discount(int price)
	{
		double dis=price*0.15;
		double finalamount=price-dis;
		
		System.out.println("The amount payable after discount is: "+finalamount);
	}
}
