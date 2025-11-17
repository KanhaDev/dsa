package sdet_questions;

public class NumberOfDigits {

	public static void main(String[] args) {

		int num = 98765;
		int count = 0;

		while (num > 0) {
			count++;
			num /= 10;
		}
		System.out.println(count);

	}

}
