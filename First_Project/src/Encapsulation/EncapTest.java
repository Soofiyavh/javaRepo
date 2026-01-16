package Encapsulation;

public class EncapTest {

	private String name;
	private String Id;
	private int age;
	
	public String getName()
	{
		return name;
	}
	
	public String getId()
	{
		return Id;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setId(String Id)
	{
		this.Id=Id;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	
	public static void main(String[] args) {
		
		EncapTest et=new EncapTest();
		et.setName("Anu");
		et.setId("Id001");
		et.setAge(23);
		
		System.out.println("Name is "+ et.getName());
		System.out.println("Id is "+ et.getId());
		System.out.println("Age is "+ et.getAge());
	}

}
