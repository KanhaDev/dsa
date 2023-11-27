package practice;

import java.util.Scanner;

public class FrequencyOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		int [] freq = new int[n];
		int visited = -1;
		for(int i=0;i<n;i++)
		{
			int count = 1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visited)
			System.out.println(" "+arr[i]+ "-- "+freq[i]);
		}

	}

}
