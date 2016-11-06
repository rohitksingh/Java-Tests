package LambdaExpressionSamole;

import java.util.ArrayList;
import java.util.List;

public class Group {

	public static List<Student> createGroup()
	{
		ArrayList<Student> list = new ArrayList<Student>();
		
		 Student s=new Student("Rohit",22,Student.Sex.Male);
		 Student s1=new Student("Walter White",40,Student.Sex.Male);
		 Student s2=new Student("Kitti",16,Student.Sex.Female);
		 Student s3=new Student("ChipMunk",22,Student.Sex.Female);
		 Student s4=new Student("Unknown",77,Student.Sex.Female);
		 Student s5=new Student("Loki",3000,Student.Sex.Male);
		 Student s6=new Student("Pikachu",3,Student.Sex.Male);
		 
		 list.add(s);
		 list.add(s1);
		 list.add(s2);
		 list.add(s3);
		 list.add(s4);
		 list.add(s5);
		 list.add(s6);
		 
		 return list;
	}
	
}
