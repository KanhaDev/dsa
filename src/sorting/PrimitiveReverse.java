package sorting;

import java.util.Arrays;
import java.util.Collections;

public class PrimitiveReverse {

	public static void main(String[] args) {
		
		Integer [] arr = {5,20,10,12};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

}
