package practice;

public class ThreeWayPartitioning {

	public static void main(String[] args) {
		int arr [] = {44,12,29,30,77,5,44,64,14};
		int a =39 ;
		int b = 45;
		
		threeWayPartition(arr,a,b);
		for(int i :arr)
	         System.out.print(i+" ");
	}
	public static void threeWayPartition(int [] array, int a , int b)
	{
		int n = array.length;
        int left = 0 , right = n-1 , mid = 0;
        while(mid < n)
        {
            if(mid < n && array[mid]<a)
            {
                int temp = array[mid];
                array[mid] = array[left];
                array[left] = temp;
                left++;
                mid++;
            }
            else if (mid<right && array[mid]>b)
            {
                int temp = array[mid];
                array[mid] = array[right];
                array[right] = temp ;
                right--;
            }
            else 
            {
               mid++;
            } 
        }
        
        
	}

}
