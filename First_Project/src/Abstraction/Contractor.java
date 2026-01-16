package Abstraction;

public class Contractor extends Employee{

	 void calculateSalary(int pymntHr)
	 {
		 int workHr=15;
		 
		 int salary=workHr*pymntHr;
		 
		 System.out.println("The salary of contractor is :"+salary);
	}
}


//public class Contractor extends Employee
/*{
	int workinghours;
	Contractor(double paymenthours,int workinghours)
	{
		super(paymenthours);
		this.workinghours=workinghours;
		
	}

	@Override
	void calculateSalary() 
	{
	
		double contractsalary=paymenthours*workinghours;
		System.out.println("contract base salary is"+contractsalary);
	}
	
}*/