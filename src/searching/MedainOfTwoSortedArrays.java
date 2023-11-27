package searching;

import java.util.Arrays;

public class MedainOfTwoSortedArrays {

	public static void main(String[] args) {
		int [] a1 = {10,20,30,40,50};
		int [] a2 = {5,15,25,35,45};
		
		System.out.println(median(a1,a2));
		System.out.println(median1(a1,a2));

	}
	
	//Naive Solution Time = O((n1+n1)Log(n1+n2)) Space = O(n1+n2)
	public static double median(int[] a1, int [] a2)
	{
		int n1 = a1.length;
		int n2 = a2.length;
		int [] temp = new int[n1+n2];
		for(int i =0;i<n1;i++)
			temp[i] = a1[i];
		for(int i =n1;i<n1+n2;i++)
			temp[i] = a2[i-n1];
		Arrays.sort(temp);
		
		if(temp.length%2==1)
			return temp[(temp.length)/2];
		else
			return (double)(temp[(temp.length)/2]+temp[((temp.length)/2)-1])/2;
	}

	//Efficient Solution
	// In this solution we have assumed that n1<=n2
	public static double median1(int [] a1, int [] a2)
	{
		int n1 = a1.length;
		int n2 = a2.length;
		int start1 = 0;
		int end1 = n1-1;
		while(start1<=end1)
		{
			int i1 = (start1+end1)/2;
			int i2 = (n1+n2+1)/2-i1;
			
			int min1 = (i1==n1?Integer.MAX_VALUE:a1[i1]);
			int max1 = (i1==0)?Integer.MIN_VALUE:a1[i1-1];
			
			int min2 = (i2==n2)?Integer.MAX_VALUE:a2[i2];
			int max2 = (i2==0)?Integer.MIN_VALUE:a2[i2-1];
			
			if(max1<=min2 && min1 >= max2)
			{
				if((n1+n2)%2==0)
					return (double) (Math.max(max1, max2)+Math.min(min1, min2))/2;
				else
					return (double)Math.max(max1, max2);
			}
			else if(max1>min2)
				end1 = i1-1;
			else
				start1 = i1+1;
		}
		
		return 0.0;
	}
}
