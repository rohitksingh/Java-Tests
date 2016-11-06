package LambdaExpressionSamole;

public class Student {

	private String name;
	private int age;
	private Sex sex;
	
	public Student(String name,int age,Sex sex)
	{
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public enum Sex{
		Male,Female;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public Sex getGender()
	{
		return sex;
	}
	
	public String toString()
	{
		return "Name "+name+" Age "+age+" Sex "+sex;
	}
	
}