package Aggregation;

public class TestAggregation {

	public static void main(String[] args) {

		Address ad=new Address("Koachi","Kerala","India");
		Employee em=new Employee(1,"Anu",ad);
		Employee em1=new Employee(2,"Manu",ad);
		Employee em2=new Employee(3,"Arun",ad);
		
		em.display();
		em1.display();
		em2.display();
		
		Address ad1=new Address("Chennai","Tamilnadu","India");
		
		Employee em3=new Employee(4,"Meena",ad1);
		Employee em4=new Employee(5,"Sam",ad1);
		Employee em5=new Employee(6,"john",ad1);
		
		em3.display();
		em4.display();
		em5.display();
	}

}
