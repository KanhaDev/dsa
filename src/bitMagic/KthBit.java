package bitMagic;

public class KthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0 , k =3;
		isSet(n,k);
		System.out.println();
		isSet1(n,k);
		System.out.println();
		isSet2(n,k);
		System.out.println();
		isSet3(n,k);
		System.out.println();
		

	}
	
	//Naive Solution
	public static void isSet(int n,int k) {
		//int x =(int) Math.pow(2, k-1);
		int x =1;
		for(int i=0;i<(k-1);i++)
			x= x*2;
		if((n&x)!=0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	//ALternate Naive Solution
	public static void isSet1(int n, int k) {
		for(int i=0;i<(k-1);i++)
			n= n/2;
		
		if((n&1)!=0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	//Efficient Solution I
	public static void isSet2(int n, int k) {
		int x = 1<<(k-1);
		
		if((n&x)!=0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	//Efficient Solution II
	public static void isSet3(int n, int k) {
		int x = 1>>(k-1);
		
		if((1&x)!=0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
