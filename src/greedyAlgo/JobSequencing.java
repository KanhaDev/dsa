package greedyAlgo;

import java.util.Arrays;

class Job {
	int deadline ;
	int profit;
	
	public Job(int d , int p)
	{
		deadline = d;
		profit = p;
	}
	
}
public class JobSequencing {

	public static void main(String[] args) {
		Job[] arr = {new Job(4,50),new Job(1,5), new Job(1,20),new Job(5,10),new Job(5,80)};
		
		System.out.println(maxProfit(arr));
		
	}
	
	public static int maxProfit(Job[] arr)
	{
		int n = arr.length;
		Arrays.sort(arr, (a,b) -> b.profit - a.profit);
		
		int maxTime = 0; 
		for(int i =0;i<n;i++)
		{
			if(maxTime < arr[i].deadline)
					maxTime = arr[i].deadline;
		}
//		System.out.println(maxTime);
		int[] res = new int [maxTime+1];
		int result = 0;
//		System.out.println(res.length);
		for(int i =0;i<=maxTime;i++)
		{
			res[i] = -1;
		}
		for(int i =0;i<n;i++)
		{
				for(int j = arr[i].deadline ;j>0;j--)
				{
//					System.out.print(arr[i].profit+" ");
					if(res[j] == -1)
					{
						res[j] = i;
						result += arr[i].profit;
						break;
					}
				}
		}
		return result;
		
	}

}
