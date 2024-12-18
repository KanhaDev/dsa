package practice;



public class Demo {

	public static void main(String[] args) 
	{
		String str = "02.111.111.111";
		String[] arr = str.split("\\.");
		System.out.println(Integer.parseInt("02") ==2);
		for(String a: arr)
		{
			System.out.println(a);
		}
		System.out.println(arr.length);
	}
}
