package sdet_questions;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 564532;
		
		int sum = 0;
		while(num>0) {
			int rem = num % 10;
			sum += rem;
			num /=10;
		}
		System.out.println(sum);

	}

}
