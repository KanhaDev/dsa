package sdet_questions;

import java.util.Scanner;

public class FindOddEven {

	public static void main(String[] args) {

		/***
		 * Odd :- Not divisible by 2 and Even :- Divisible by 2, means remainder will be 0
		 ***/

		// Initialize Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Take integer value as input from user
		int num = sc.nextInt();

		// Conditions to check number is odd or even
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}

	}

}
