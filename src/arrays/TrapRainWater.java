package arrays;

public class TrapRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,0,6,2,3};
		System.out.println(rainWater(arr));

	}
	
	public static int rainWater(int [] arr)
	{
		int n = arr.length,res=0;
		int [] lMax = new int[n]; 
		int [] rMax = new int[n]; 
		
		lMax[0] = arr[0];
		for(int i =1;i<n;i++)
			lMax[i]=Math.max(arr[i], lMax[i-1]);
		
		rMax[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--)
			rMax[i] = Math.max(arr[i], rMax[i+1]);
		
		for(int i=1;i<n-1;i++)
			res = res + (Math.min(lMax[i], rMax[i])-arr[i]);
		
		
		return res;
	}

}
