package sdet_questions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/***
		 * Prime number is a number divisible by 1 and own 7 is prime 9 is not prime
		 ***/

		// Initialize Scanner object to take input from user
		Scanner sc = new Scanner(System.in);

		// Take integer value as input from user
		int num = sc.nextInt();

		if (isPrime(num)) {
			System.out.println(num + " is Prime");
		} else {
			System.out.println(num + " is not Prime");
		}

	}

	// Brute force solution Big O of n
	public static boolean isPrimeBruteForce(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	// Efficient way to find prime
	public static boolean isPrimeEfficient(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	// More efficient way to find prime
	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		for (int i = 5; i * i <= num; i = i + 6) {
			if (num % i == 0 || num % (i + 2) == 0)
				return false;
		}
		return true;
	}
}
