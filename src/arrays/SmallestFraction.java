package arrays;
import java.util.*;

public class SmallestFraction {


public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s = new Scanner(System.in);
      	int n = s.nextInt();
      	String s2 = s.nextLine();
		String str = s.nextLine();
      	int k = s.nextInt();
      	s.close();
      	String [] parts = str.split(",");
      	int [] arr = Arrays.stream(parts)
                               .map(String::trim)
                               .mapToInt(Integer::parseInt)
                               .toArray();
      int total = n*(n-1)/2;
      	double [][] fraction = new double [total][3];
      int in = 0;
      	for(int i=0;i<n-1;i++)
        {
          for(int j=i+1;j<n;j++)
          {
            fraction[in][0] = (double)arr[i]/(double)arr[j];
            fraction[in][1] = arr[i];
            fraction[in][2] = arr[j];
            in++;
          }
        }
      Arrays.sort(fraction ,(row1,row2) -> Double.compare(row1[0],row2[0]));
      
      System.out.println((int)fraction[k-1][1] +" "+(int)fraction[k-1][2]);
	}

}
