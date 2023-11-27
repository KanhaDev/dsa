package practice;

public class FindMissingAndRepeating {

	public static void main(String[] args) {
		int [] arr = {4,3,2,4,7,1,5};
		int  n = arr.length;
		System.out.println(findTwoElement(arr,n)[0]);
 
	}
	static int[] findTwoElement(int arr[], int n) {
        // code here
        int [] a = new int[2];
        
        int visited = -1;
        int i =0;
        while(i<n)
        {
            if(arr[i]!=visited && arr[arr[i]-1]!=visited)
            {
            	System.out.print(arr[i]+" "+arr[arr[i]-1]);
            	System.out.println();
            	int temp = arr[arr[i]-1];
            	arr[arr[i]-1] = visited;
            	if(arr[i]!=visited)
            		arr[i] = temp;
                
            }
            else
                i++;
    
        }
       
        for(int j: arr)
        	System.out.print(j+" ");
        System.out.println();
        
        for(int k =0;k<n;k++)
            if(arr[k]>0)
            {
                a[0] = arr[k];
                a[1] = k+1;
            }
        
        return a;
    }

}
