package bitMagic;

public class TwoOddOccuringNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int [] arr = {3,4,3,4,5,4,4,6,7,7};
		//int[] arr = {1,3,2,3,3,1};
		int[] arr = {1,1,3,3,3,5,3,7,9,7,9,7};
		int n =arr.length;
		findOdd(arr,n);
		System.out.println();
		oddAppearing(arr,n);
	}
	
	public static void findOdd(int[] arr , int n)
	{
		for(int i =0;i<n;i++) {
			int count =0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count%2!=0) {
				
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	//Efficient SOlution
	
	public static void oddAppearing(int[] arr, int n) {
		int x = arr[0];
		for(int i=1;i<n;i++)
			x= x^arr[i];
		
		int k = (x&~(x-1));
		int res1=0, res2=0;
		for(int i=0;i<n;i++)
		{
			if((arr[i]&k)!=0)
				res1 = res1^arr[i];
			else
				res2 = res2^arr[i];
		}
		System.out.println(res1+ " " +res2);
	}

}
