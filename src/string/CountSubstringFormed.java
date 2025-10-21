package string;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubstringFormed {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		HashMap<Integer,Integer> map = new HashMap<>();
		int count = countWays(str,0,map);
		System.out.println(count);
		sc.close();
	}
	private static int countWays(String str, int index,HashMap<Integer,Integer> map) {
        // Base case: if index reaches the end, it's a valid decoding.
        if (index == str.length()) {
            return 1;
        }
        
        if(map.containsKey(index))
        	return map.get(index);
        // If the current character is '0', it cannot be decoded.
        if (str.charAt(index) == '0') {
            return 0;
        }

        // Decode single digit
        int count = countWays(str, index + 1,map);

        // Decode two digits if possible
        if (index + 1 < str.length()) {
            int twoDigit = Integer.parseInt(str.substring(index, index + 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                count += countWays(str, index + 2,map);
            }
        }
        map.put(index, count);
        return count;
    }

}
