package Polymorphism;

public class Discount  {

	public static void main(String[] args) {
		
		Onseason on=new Onseason();
		OffSeason off=new OffSeason();
		boolean season=true;
		
		if(season)
		{
			on.discount(4000);
		}
		else
		{
			off.discount(4000);
		}

	}

}
