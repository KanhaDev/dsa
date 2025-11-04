package sdet_questions;

import java.util.Scanner;

public class FibonacciUpToN {

	public static void main(String[] args) {
		// Fibonacci Series
		// 0 1 1 2 3 5 8 13 21 34
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		
			for (int i = 0; i < n; i++) {
				System.out.print(first +" ");
				int curr = first + second;
				first = second;
				second = curr;
				
			}
	

	}

}
