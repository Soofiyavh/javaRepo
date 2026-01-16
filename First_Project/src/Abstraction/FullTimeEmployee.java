package Abstraction;

public class FullTimeEmployee extends Employee{

	void calculateSalary(int pymntHr)
	 {
		 		 
		 int salary=pymntHr*8;
		 
		 System.out.println("The salary of Full time employee is :"+salary);
	}
	
	public static void main(String[] args) {
				
			Employee f=new FullTimeEmployee();
			Employee c=new Contractor();
			f.calculateSalary(500);
			c.calculateSalary(500);
	}

}

/*
 * public class FullTimeEmployee extends Employee 
 * {
 *  FullTimeEmployee(double paymenthours) 
 * { 
 * super(paymenthours);
 * 
 * }
 * 
 * void calculateSalary()
 *  {
 *   double salary=paymenthours*8;
 * System.out.println("Full time employee salary:"+salary);
 *  } 
 *  public static void main(String args[]) 
 * { 
 * Contractor c=new Contractor(1000,5); 
 * FullTimeEmployee  f=new FullTimeEmployee(2000); 
 * c.calculateSalary(); 
 * f.calculateSalary();
 *  } }
 */