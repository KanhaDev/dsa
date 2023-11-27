package sorting;

import java.util.Arrays;

public class UnionOfTwoSorted {

	public static void main(String[] args) {
		int [] a = {3,5,8,8,8,9,11};
		int [] b = {2,8,9,9,9,10,15,15,15};
		union(a,b);
		System.out.println();
		printUnion(a,b);
	}
	
	//Naive Solution
	public static void union(int [] a, int [] b)
	{
		int m = a.length;
		int n = b.length;
		int [] c = new int [m+n];
		for(int i =0;i<m;i++)
			c[i] = a[i];
		for(int i =0;i<n;i++)
			c[i+m] = b[i];
		Arrays.sort(c);
		
		for(int i =0;i<m+n;i++)
		{
			if(i>0 && c[i]==c[i-1])
				continue;
			System.out.print(c[i]+" ");
		}		
	}
	
	//Efficient Solution
	
	public static void printUnion(int [] a , int [] b)
	{
		int m = a.length;
		int n = b.length;
		int i = 0 , j = 0;
		
		while(i<m && j<n)
		{
			if(i>0 && a[i] == a[i-1])
				i++;
			else if(j>0 && b[j] == b[j-1])
				j++;
			else if(a[i] >b[j] )
			{
				System.out.print(b[j]+" ");
				j++;
			}
			else if( a[i]<b[j] )
			{
				System.out.print(a[i]+" ");
				i++;
			}
			else
			{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			
		}
		while(i<m)
			if(i>0 && a[i]!=a[i-1])
			System.out.print(a[i++]+" ");
			
		while(j<n)
			if(j>0 && b[j] != b[j-1])
			System.out.print(b[j++]+" ");
		
			
	}

}
