package searching;

public class Search_In_Infinite {

	public static void main(String[] args) {
		int [] arr = {1,10,15,20,40,80,90,100,120,500};
		int x = 100;
		System.out.println(search(arr,x));

	}
	
	public static int search(int [] arr, int x)
	{
		if(arr[0] == x)
			return 0;
		int i =1;
		while(arr[i]<x)
			i=i*2;
		if(arr[i]==x)
			return i;
		return BinarySearch.bSearch(arr, i/2+1, i-1, x);
	}

}
