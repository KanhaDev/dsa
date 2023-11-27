package java8;

public class StringFormatterImp {

	public static void main(String[] args) 
	{
		System.out.println("Inside main method:");
		
		StringFormatter st = (s1,s2) -> 
		{
			return s1+" "+s2;
		};
		System.out.println(st.format("Lambda","Expression"));
		StringFormatter st1 = (s1,s2) -> 
		{
			return s1+"-"+s2;
		};
		System.out.println(st1.format("Lambda","Expression"));
		StringFormatter st2 = (s1,s2) -> 
		{
			return s1.toUpperCase()+" "+s2.toUpperCase();
		};
		System.out.println(st2.format("Lambda","Expression"));

	}

}
