package sdet_questions;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Armstrong number
		// An Armstrong number, also known as a narcissistic number or pluperfect
		// digital invariant (PPDI), is a number that equals the sum of its own digits
		// each raised to the power of the total number of digits.
		// 153 = 3 digits = 1^3 + 5 ^3 + 3^3 = 1+125+27 = 153
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int size = 0;
		int arm = 0;
		int original = num;
		while(num>0) {
			size ++;
			num /= 10;
		}
		num = original;
		while(num>0)
		{
			int rem = num % 10;
			arm = arm +  (int)Math.pow(rem, size);
			num /= 10;
		}
		//System.out.println(arm);
		if((int)arm == original)
		{
			System.out.println(original +" is an Armstrong");
		}else {
			System.out.println(original +" is not an Armstrong");
		}

	}

}
