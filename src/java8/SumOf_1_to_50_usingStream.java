package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOf_1_to_50_usingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		
		
		Integer sum = integers.stream()
		  .reduce(0, Integer::sum);
		
		System.out.println(sum);

	}

}
