package arrays;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int [] arr = {10,10,10,25,30,30};
		freqSorted(arr);
	}
	public static void freqSorted(int[] arr)
	{
		int n = arr.length;
		int freq =1,i=1;
		while(i<n)
		{
			while(i<n && arr[i]==arr[i-1])
			{
				freq++;
				i++;
			}
			System.out.println(arr[i-1]+" "+freq);
			freq =1;
			i++;
		}
		if(i==1||arr[n-2]!=arr[n-1])
			System.out.println(arr[n-1]+" "+1);
	}

}
