package trainers;

public class Person 
{

	public String name;
	public String defaultResponse;
	
	public Person(String s)
	{
		setName(s);	
	}
	public void setName(String s)
	{
		name = s;
	}
	public String getName()
	{
		return name;
	}
	
}
