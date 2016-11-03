package Composition;

public class ClassA {

	private ClassB classB = new ClassB();
	
	public void methodA()
	{
		classB.methodB();
	}
	
}

