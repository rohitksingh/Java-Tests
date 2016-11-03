package Aggregation;

public class ClassA {

	private ClassB classB;
	
	public ClassA(ClassB classB)
	{
		this.classB = classB;
	}
	
	public void methodA()
	{
		classB.methodB();
	}
	
}
