package matrix;

public class Demo1 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		
		//We can create a 2D array 
		@SuppressWarnings("unused")
		int[][] arr2 = new int [4][3];
		
		// This is also a valid way to declare 2D array which is also known as jagged array
		//Jagged array is a 2D array which does not have same row size
		@SuppressWarnings("unused")
		int[][] arr3 = new int [3][];
		
		for(int i =0;i<arr.length;i++)
			for(int j =0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
	}

}
