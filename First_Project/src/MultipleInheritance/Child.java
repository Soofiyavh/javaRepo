package MultipleInheritance;

public class Child extends Mother,Father {   

	public static void main(String[] args) {
		 
		Child c=new Child();
		c.sing();
		c.job();

	}

}

//Ambiguity ocuurs.ie, daimond problem.So that class concept in java doesn't support multiple inheritance.So that it doesn,t work.
