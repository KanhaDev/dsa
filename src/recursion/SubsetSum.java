package recursion;

import java.util.ArrayList;

public class SubsetSum {

	public static void main(String[] args) {
		int[] arr = {1,2,1};
		int sum = 2;
		ArrayList<Integer> list = new ArrayList<>();
		subsetSum(arr,sum,0,list,0);

	}

	public static void subsetSum(int arr[], int sum,int s,ArrayList<Integer> list,int i)
	{
			if(i == arr.length)
			{
				if(sum == s)
				{
					System.out.println(list);
				}
				return;
			}
			
			//take situation
			list.add(arr[i]);
			s += arr[i];
			subsetSum(arr,sum,s,list,i+1);
			list.remove(list.size()-1);
			s -= arr[i];
			subsetSum(arr,sum,s,list,i+1);
	}
}
