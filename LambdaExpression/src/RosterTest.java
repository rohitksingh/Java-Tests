import java.util.ArrayList;
import java.util.List;

public class RosterTest {

	public static void main(String[]  args)
	{
		List<Person> roster=createList();
		
		//printPersonOlderThan(roster, 3);
		//printPersonInrange(roster, 16, 20);
		//RosterTest.CheckEligiblePerson c;
		//printPerson(roster,new CheckEligiblePerson());
		
		printPerson(roster,new CheckPerson()
		{
        	@Override
			public boolean test(Person p) {
				return (p.getAge()==4);
			}
		});
		
	
	}
	
	public static void printPersonOlderThan(List<Person> list,int age)
	{
		for(Person p:list){
		   if(p.getAge()>age)
			  p.printPerson();
		}
	}
	
	public static void printPersonInrange(List<Person> list,int low,int high)
	{
		for(Person p:list)
		{
			if(p.getAge()>=low && p.getAge() <=high)
				p.printPerson();
		}
	}
	
	public static void printPerson(List<Person> roster,CheckPerson tester)
	{
		for(Person p:roster)
		{
			if(tester.test(p))
				p.printPerson();
		}
	}
	
	/*
	
	class CheckPersonEligibleForSelectiveServices{
		
		public boolean check(Person p)
		{
			return p.getGender()==Person.Sex.Female && p.getAge()>=18;
		}
	}
	*/
	
	
	
	
	
	public static List<Person> createList()
	{
		List<Person> list=new ArrayList<Person>();
		Person rohit=new Person("John",18,Person.Sex.Male);
		Person alisha=new Person("Alisha",19,Person.Sex.Female);
		Person kitti=new Person("Kitty", 4, Person.Sex.Female);
		list.add(rohit);
		list.add(alisha);
		list.add(kitti);
		return list;
	}

}

class Person{
	private int age;
	public Sex gender;
	private String name;
	
	public Person(String name,int age,Sex gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getSex() {
		return gender;
	}

	public void setSex(Sex gender) {
		this.gender = gender;
	}

	public enum Sex{
		Male,Female;
	}
	
	public void printPerson()
	{
		 System.out.println(this);
	}
	
	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString()
	{
		return new String().format("%-10s %-3d %-6s" , name,age,gender);
		//name+" "+age+" "+gender;
	}	
}

class CheckEligiblePerson implements CheckPerson{
	
	@Override
	public boolean test(Person p) {    
		return p.getGender()==Person.Sex.Female && p.getAge()>=18;
	}
	
}

interface CheckPerson{
	
	public boolean test(Person p);
		
}