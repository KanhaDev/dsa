package arrays;

public class MaximumAppearInRange {

	public static void main(String[] args) {
	
		int [] left = {1,2,4};
		int [] right = {4,5,7};
		int n =3;
		System.out.println(maxAppear(left,right,n));
		System.out.println(maxAppear1(left,right,n));

	}

	//Efficient Solution 
	
	public static int maxAppear1(int [] left, int [] right, int n)
	{
		int [] freq = new int[100];
		
		for(int i =0;i<n;i++)
		{
			freq[left[i]]++;
			freq[right[i]+1]--;
		}
		
		for(int i =1;i<100;i++)
			freq[i] = freq[i-1]+freq[i];
			
		int res= 0;
		for(int i =1;i<100;i++)
			if(freq[i]>freq[res])
				res=i;
		return res;
		
	}
	//Naive Solution
	public static int maxAppear(int [] left, int [] right , int n)
	{
		int [] freq = new int[100];
		
		for(int i =0;i<n;i++)
			for(int j =left[i];j<=right[i];j++)
				freq[j]+=1;

		int res = 0;
		for(int i=1;i<100;i++)
			if(freq[i]>freq[res])
				res=i;
		return res;
	}
}
