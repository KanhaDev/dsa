package pattern;

public class Pattern7 {

	public static void main(String[] args) {
		int n =5;
		for(int i =0;i<n;i++)
        {
            char first = 'A';
            for(int j =0;j<n-i;j++)
            {
                System.out.print((first++)+" ");
            }
            System.out.println();
        }

	}

}
