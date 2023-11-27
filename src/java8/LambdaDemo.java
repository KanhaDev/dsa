package java8;


@FunctionalInterface
interface SumInter{
	public abstract int sum(int a , int b);
	
}

public class LambdaDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		SumInter s = (a,b)-> a+b;
		System.out.println(s.sum(5, 7));
		System.out.println(s.sum(4, 6));

	}

}
