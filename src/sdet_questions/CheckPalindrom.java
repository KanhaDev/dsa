package sdet_questions;

public class CheckPalindrom {

	public static void main(String[] args) {
			System.out.println(isPalindrom(989));
	}
	
	public static boolean isPalindrom(int num) {
		int originalNum = num;
		int reversedNum = 0;
		
		while(num > 0) {
			int rem = num % 10;
			reversedNum = reversedNum *10 + rem;
			num /= 10;
		}
		
		if(reversedNum == originalNum)
			return true;
		return false;
	}

}
