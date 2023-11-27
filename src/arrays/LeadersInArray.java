package arrays;

public class LeadersInArray {

	public static void main(String[] args) {
		int [] arr = {7,10,4,3,6,5,2};
		
		int [] res = leader(arr);
		for(int i :res)
			System.out.print(i+" ");
		

	}
	
	public static int[] leader(int[] arr)
	{
		int n = arr.length;
		int [] res = new int [n];
		int count = 0;
		
		for(int i =0 ;i<n;i++)
		{
			boolean flag = true;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
					flag=false;
			}
			if(flag)
			{
				res[count]= arr[i];
				count++;
			}
		}
		return res;
	}

}
