package arrays;

public class PrefixWeightedSum {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 4, 6, 1 };
		int n = arr.length;

		int[] ps = new int[n];
		ps[0] = arr[0];
		for (int i = 1; i < n; i++)
			ps[i] = ps[i - 1] + arr[i];
		for(int i =0;i<n;i++)
			System.out.print(ps[i]+" ");
		System.out.println();
		

		int[] pWsum = new int[n];
		pWsum[0] = arr[0];
		for (int i = 1; i < n; i++)
			pWsum[i] = pWsum[i-1] + arr[i]*(i+1);
		
		for(int i =0;i<n;i++)
			System.out.print(pWsum[i]+" ");
		System.out.println();
		
		System.out.println(getSum(ps,pWsum,0,2));

	}

	public static int getSum(int[] ps, int[] pWsum, int l, int r) {
		if(l==0)
			return pWsum[r];
		
		return ((pWsum[r] -pWsum[l-1]) - (l-1)*(ps[r]-ps[l-1]));
	}

}
