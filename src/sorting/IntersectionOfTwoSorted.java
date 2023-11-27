package sorting;

public class IntersectionOfTwoSorted {

	public static void main(String[] args) {
		int [] a = {3,5,10,10,10,15,15,20};
		int [] b = {5,10,10,15,30};
		intersection(a,b);
		System.out.println();
		printIntersection(a,b);
	}
	
	//Naive Solution   Time : O(m*n)
	public static void intersection (int [] a, int [] b)
	{
		int m = a.length;
		int n = b.length;
		for(int i =0;i<m;i++)
		{
			if(i>0 && a[i]==a[i-1])
				continue;
			for(int j =0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
					break;
				}
					
			}
		}
	}
	
	//Efficient Solution    Time :O(m+n)
	public static void printIntersection(int [] a , int [] b)
	{
		int m = a.length;
		int n = b.length;
		int i = 0 ,j = 0;
		while(i<m && j<n)
		{
			if(i>0 && a[i]==a[i-1])
				{
				i++;
				continue;
				}
			//else if(j>0 && b[j] == b[j-1])
				//j++;
			if(a[i]==b[j])
			{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			else if(a[i]>b[j])
				j++;
			else
				i++;	
		}
	}
}
