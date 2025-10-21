package string;
import java.util.Scanner;

public class CountPalindrom {


	  
	  public static void main(String [] args)
	  {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    System.out.println(validPalindrom(s));
	    sc.close();
	  }
	  
	  private static int validPalindrom(String s)
	  {
	    int n = s.length();
	    int count  =0;
	    for(int center=0;center< 2 * n -1 ;center ++)
	    {
	      int left = center / 2;
	      int right = left + center % 2;
	      //Expand while characters match
	      while(left>=0 && right <n && s.charAt(left) == s.charAt(right))
	      {
	        count++;
	        left--;
	        right++;
	      }
	    }
	    return count;
	  }
	  

}
