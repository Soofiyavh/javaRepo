package CustomExceptions;

public class Voting {

	static void checkAge(int age) throws InvalidAgeExcep 	
	{
		if(age<18)
		{
			throw new InvalidAgeExcep("Age must be 18 or above");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			Voting.checkAge(16);
		}
		catch(InvalidAgeExcep i)
		{
			System.out.println(i.getMessage());
		}
	}

}
