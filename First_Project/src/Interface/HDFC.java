package Interface;

public class HDFC implements RBI {

	public void recurringDeposit(int amount,int duration)
	{
		double interest=amount*0.15;
		double balance=interest*duration;
		
		System.out.println("The amount adding for the interest is: "+balance);
	}
	
	public static void main(String[] args) {
		
		HDFC i=new HDFC();
		i.recurringDeposit(5000, 10);
	}

}
