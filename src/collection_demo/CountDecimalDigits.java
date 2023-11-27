package collection_demo;

public class CountDecimalDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dob = 343.52342;
		String str = String.valueOf(dob);
		System.out.println(str);
		String[] str2 = str.split(".",2);
			
				System.out.println(str2[1]);
		
	}

}
