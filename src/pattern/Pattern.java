package pattern;

public class Pattern {

	public static void main(String[] args) {
		int n = 7;
		for(int i=0;i<n;i++)
        {
          for(int j=0;j<n-1-i;j++)
          {
              System.out.print(" ");
          } 
          for(int j=0;j<2*i+1;j++)
          {
              System.out.print("*");
          } 
          for(int j=0;j<n-1-i;j++)
          {
              System.out.print(" ");
          }
          System.out.println();
        }
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<i;j++)
          {
              System.out.print(" ");
          } 
          for(int j=0;j<n*2-(2*i+1);j++)
          {
              System.out.print("*");
          } 
          for(int j=0;j<i;j++)
          {
              System.out.print(" ");
          }
          System.out.println();
        }
	}

}
