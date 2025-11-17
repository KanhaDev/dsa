package sdet_questions;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "My name is Kanhaiya";
		String [] words = str.split(" ");
		
		String reversedStr = "";
		
		for(int i=0;i<words.length;i++) {
			String reversedWord = "";
			for(int j=words[i].length()-1; j>=0;j--) {
				reversedWord = reversedWord + words[i].charAt(j);
			}
			reversedStr = reversedStr + reversedWord+" ";
		}
		System.out.println(reversedStr);

	}

}
