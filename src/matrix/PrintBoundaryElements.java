package matrix;

public class PrintBoundaryElements {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printBoundary(mat);

	}
	public static void printBoundary(int[][] arr)
	{
		int R = arr.length;
		for(int i =0 ;i<R;i++)
		{
			int C = arr[i].length;
			if(i==0)
				for(int j =0;j<C;j++)
					System.out.print(arr[i][j]+" ");
			else if(i==R-1)
				for(int j =C-1;j>=0;j--)
					System.out.print(arr[i][j]+" ");
			else
				System.out.print(arr[i][C-1]+" ");
		}
		for(int i =R-2;i>0;i--)
		{
			System.out.print(arr[i][0]+" ");
		}
	}

}
