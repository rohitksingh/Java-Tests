package LambdaExpressionSamole;

import java.util.List;

public class Test {

	public static void main(String[] args)
	{
		List<Student> list = Group.createGroup();
		PrintStudent printer = new PrintStudent();
		//StudentChecker checker = new AllMale();
		//printer.printAllEligibleStudent(list, checker);    //Using Interfaces
		
		/*printer.printAllEligibleStudent(list, new StudentChecker() {
			
			@Override
			public boolean CheckConditionFor(Student s) {
				return s.getGender() == Student.Sex.Female;
			}
		});*/                                                // Using Anonymous Class
		
	    printer.printAllEligibleStudent(list, (Student s)->s.getAge()>100);
	}
	
}