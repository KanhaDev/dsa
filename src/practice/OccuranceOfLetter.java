package practice;

import java.util.Scanner;

public class OccuranceOfLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int n = str.length();
		char [] ch = str.toCharArray();
		
		int [] freq = new int[n];
		int visited = -1;
		for(int i=0;i<n;i++)
		{
			int count = 1;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visited)
			System.out.println(" "+ch[i]+ "-- "+freq[i]);
		}
	}
}
