package practice;

import java.util.Scanner;

public class OddEvenMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int max = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
				if(arr[i]>max)
				{
					max = arr[i];
				}
			}
		}
		System.out.println();
		System.out.println("Maximum even number is "+max);
	}
}
