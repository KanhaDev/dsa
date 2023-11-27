package searching;

import java.util.Arrays;

public class RepeatingElement {

	public static void main(String[] args) {
		int [] arr = {0,2,1,3,2,2};
		System.out.println(findRepeated(arr));
		System.out.println(findRepeated1(arr));
		System.out.println(findRepeated2(arr));
		System.out.println(findRepeated3(arr));

	}
	
	//Super Naive Solution   Time - O(n^2)
	public static int findRepeated(int [] arr)
	{
		int n =arr.length;
		for(int i =0;i<n-1;i++)
			for(int j =i+1;j<n;j++)
				if(arr[i]==arr[j])
					return arr[i];
		return -1;
	}
	
	//Naive Solution  Time - O(n log n)
	public static int findRepeated1(int [] arr)
	{
		int n = arr.length;
		Arrays.sort(arr);
		for(int i =0;i<n-1;i++)
			if(arr[i]==arr[i+1])
				return arr[i];
		return -1;
	}
	
	//Efficient Solution Time - O(n)  Space - O(n)
	public static int findRepeated2(int [] arr)
	{
		int n = arr.length;
		boolean [] visited = new boolean[n-1];
		
		for(int i =0;i<n;i++)
		{
			if(visited[arr[i]])
				return arr[i];
			visited[arr[i]] = true;
		}
		return -1;
	}
	
	//Most Efficient solution
	public static int findRepeated3(int [] arr)
	{
		int slow = arr[0]+1 , fast = arr[0]+1;
		do
		{
			slow = arr[slow]+1;
			fast = arr[arr[fast]+1]+1;
		}while(slow!=fast);
		
		slow = arr[0]+1;
		
		while(slow!=fast)
		{
			slow = arr[slow]+1;
			fast = arr[fast]+1;
		}
		
		return (slow-1);
	}
}
