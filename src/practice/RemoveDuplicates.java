package practice;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int n = str.length();
		char[] ch = str.toCharArray();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (ch[i] == ch[j]) {
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ') {
				
				System.out.print(ch[i]+"");
			}
		}
	}
}
