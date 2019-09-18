
public class Student {

	
	public Student()
	{
		System.out.println("Default Constructor");
	}
	
	public Student(String name, int roll)
	{
		setName(name);
		setRoll(roll);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	//Instance variables
	private int roll;
	private String name;
	
}





