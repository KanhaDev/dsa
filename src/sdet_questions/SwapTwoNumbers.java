package sdet_questions;

public class SwapTwoNumbers {
	/*** 
	 * a = 5 , b = 3
	 * a = a + b = 5 + 3 = 8 
	 * b = a - b = 8 - 3 = 5
	 * a = a - b = 8 - 5 = 3 ***/

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		System.out.println("Before swapping "+ a+" "+b);
		swapWithThirdVariable(a,b);
		swapWithoutThirdVariable(a,b);
		
	}

	public static void swapWithThirdVariable(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping "+ a+" "+b);
		
	}
	public static void swapWithoutThirdVariable(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping "+ a+" "+b);
	}

}
