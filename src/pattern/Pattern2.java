package pattern;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=n-1-i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
