package sdet_questions;

import java.util.Scanner;

public class FactorialOnGivenNumber {

	//Factorial of 5 = 5 * 4 * 3 * 2 * 1 = 120
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = num; i>0;i--) {
			fact *= i;
		}	
		System.out.println("Factorial of "+num+" is "+ fact);
	}
	

}
