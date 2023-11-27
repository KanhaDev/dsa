package practice;

import java.util.Scanner;

public class DivideNEqualParts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println("Enter the no of parts you want to divide");
		int s = sc.nextInt();
		int e = str.length()/s;
		
		for(int i=0;i<str.length();i+=e)
		{
			System.out.print(str.substring(i, i+e)+" ");
		}		
	}
}
