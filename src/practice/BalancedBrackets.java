package practice;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {

		String str = "(a+b)+{(c+d)*(e/f)}]";
		System.out.println(balancedBracket(str));
	}

	public static boolean balancedBracket(String str) {
		char[] arr = str.toCharArray();
		Stack<Character> ch = new Stack<>();

		for (char c : arr) {
			if (c == '{' || c == '(' || c == '[') {
				ch.push(c);
			}
			if (c == '}' | c == ')' | c == ']') {

				if (!ch.empty()) {
					if ((c == '}' & ch.peek() == '{') | (c == ')' & ch.peek() == '(') | (c == ']' & ch.peek() == '[')) {
						ch.pop();
					}
				} else
					return false;
			}
		}
		if (ch.size() != 0)
			return false;

		return true;
	}

}
