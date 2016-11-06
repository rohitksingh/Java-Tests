package LambdaExpressionSamole;

import java.util.List;

public class Test {

	public static void main(String[] args)
	{
		List<Student> list = Group.createGroup();
		PrintStudent printer = new PrintStudent();
		StudentChecker checker = new AllMale();
		printer.printAllEligibleStudent(list, checker);
	}
	
}
