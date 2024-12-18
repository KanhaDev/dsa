package pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 7;
		
		for(int i =0;i<n;i++)
		{
			for(int j =1;j<=i+1;j++)
			{
				System.out.print(j+" ");
			}
			for(int j =0;j<(2*n-(i*2+1))-1;j++)
			{
				System.out.print(" ");
			}
			for(int j =1;j<2*n-(i*2+1);j++)
			{
				System.out.print(" ");
			}
			for(int j =i+1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
