package GenericsAndLambaExpression;

public class Test {

	public static void main(String[] args)
	{
		Arithmetic<Integer> sum = (Integer i1,Integer i2)->{
			System.out.print("Sum of "+i1+" and "+i2+" is ");
			return i1+i2;
			};
		
	     Arithmetic<Integer> diff = (Integer i1,Integer i2)->{
			System.out.print("Difference of "+i1+" and "+i2+" is ");
			return i1-i2;
			};	
		
		 Arithmetic<Integer> mul = (Integer i1,Integer i2)->{
			System.out.print("Multiplication of "+i1+" and "+i2+" is ");
			return i1*2;
			};
		
		Arithmetic<Integer> div = (Integer i1,Integer i2)->{
			System.out.print("Division of "+i1+" and "+i2+" is ");
			return i1-i2;
			};
			
		Arithmetic<String> concat = (String i1,String i2)->{
					System.out.print("Concatination of "+i1+" and "+i2+" is ");
					return i1+i2;
					};	
			
		perform(10, 2, sum);	
		perform(10, 2, diff);
		perform(10, 2, mul);
		perform(10, 2, div);
		perform("10", "2", concat);
		
	}
	
	public static <T> void  perform(T t1,T t2,Arithmetic<T> arithmetic)
	{
		System.out.println(arithmetic.compute(t1, t2));
	}
}