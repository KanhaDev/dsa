package mathematics;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 11;
		System.out.println(isPrime(num));
		System.out.println(isPrime1(num));
		System.out.println(isPrime2(num));
		System.out.println(isPrime3(num));
	}
	public static boolean isPrime(int num) {
		if(num==1)return false;
		for(int i=2;i<num/2;i++) {
			if(num%i==0)
				return false;
		}
		
		return true;
	}
	//Efficient way
	public static boolean isPrime1(int num) {
		if(num==1) return false;
		for(int i=2;i*i<=num;i++)
			if(num%i==0)
				return false;
		
		return true;
	}
	
	//More efficient way for large numbers
	public static boolean isPrime2(int num) {
		if(num==1) return false;
		if(num==2||num==3) return true;
		if(num%2==0||num%3==0) return false;
		for(int i=5;i*i<=num;i+=6)
			if(num%i==0||num%(i+2)==0)
				return false;
		
		return true;
	}
	
	//Found another efficient way to check Prime
	public static boolean isPrime3(int num) {
		int count = 0;
		for(int i=1;i*i<=num;i++)
		{
			if(num % i == 0)
			{
				count++;
				if((num/i) != i)
					count++;
			}
		}
		if(count == 2)
				return true;
		return false;
	}

}
