package Aggregation;

public class Test {

	public static void main(String[] args)
	{
		ClassB classB = new ClassB();
		ClassA classA = new ClassA(classB);
		
		classA.methodA();
	}
}
