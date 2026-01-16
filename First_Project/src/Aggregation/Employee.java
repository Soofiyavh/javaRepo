package Aggregation;

public class Employee {

	int id;
	String name;
	Address adrs;
	
	Employee(int id,String name,Address adrs)
	{
		this.id=id;
		this.name=name;
		this.adrs=adrs;
	}
	
	void display()
	{
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
		System.out.println("Employee address is :"+adrs.city+", "+adrs.state+", "+adrs.country);
	}
}
