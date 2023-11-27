package bitMagic;

public class OddOccuringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,4,4,4,5,5};
		//int[] arr = {8,7,7,8,8};
		//int n =5;
		int n =7;
		System.out.println(findOdd(arr,n));
		System.out.println(findOdd1(arr,n));

	}
	
	//Naive Solution for this Problem
	public static int findOdd(int[] arr, int n) {
		
		for(int i=0;i<n;i++) {
			int count =0;
			for(int j=0;j<n;j++)
				if(arr[i]==arr[j])
					count++;
			if(count%2!=0)
				return arr[i];
		}
		return -1;
		
	}
	
	//Efficient Solution using XOR bitwise operator 
	public static int findOdd1(int[] arr , int n) {
		int res = arr[0];
		for(int i=1;i<n;i++)
			res = (res ^ arr[i]);
		return res;
	}

}
