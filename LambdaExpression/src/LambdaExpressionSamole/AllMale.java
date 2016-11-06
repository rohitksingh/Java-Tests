package LambdaExpressionSamole;

public class AllMale implements StudentChecker{

	@Override
	public boolean CheckConditionFor(Student s) {
		
		return s.getGender() == Student.Sex.Male;
	}

}
