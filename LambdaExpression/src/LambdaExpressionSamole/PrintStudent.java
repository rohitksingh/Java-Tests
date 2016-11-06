package LambdaExpressionSamole;

import java.util.List;

public class PrintStudent {

	public void printAllEligibleStudent(List<Student> list,StudentChecker checker)
	{
		for(Student s : list)
		{
			if(checker.CheckConditionFor(s))
			System.out.println(s);
		}
	}
	
}
