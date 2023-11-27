package arrays;

public class EquilibruimPoint {

	public static void main(String[] args) {
		int [] arr = {4,2,2};
		System.out.println(ePoint(arr));
		System.out.println(ePoint1(arr));
	}

	//Efficient solution
	public static boolean ePoint1(int [] arr)
	{
		int n = arr.length;
		int rs = 0;
		for(int i =0;i<n;i++)
			rs+=arr[i];
		int ls =0;
		for(int i =0;i<n;i++)
		{
			rs-=arr[i];
			if(ls==rs)
				return true;
			ls+=arr[i];
		}
		
		return false;
	}
	
	//Naive Solution
	public static boolean ePoint(int [] arr)
	{
		int n = arr.length;
		
		for(int i =0;i<n;i++)
		{
			int ls=0,rs=0;
			for(int j =0;j<i;j++)
				ls+=arr[j];
			for(int k =i+1;k<n;k++)
				rs+=arr[k];
			
			if(ls==rs)
				return true;
		}
		return false;
	}
}
