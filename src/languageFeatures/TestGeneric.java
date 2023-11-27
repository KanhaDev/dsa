package languageFeatures;

public class TestGeneric {

	public static void main(String[] args) {

		Integer[] arrInteger = { 10, 20, 30, 40, 50, 60 };
		Character[] arrChar = { 'I', 'N', 'F', 'O', 'S', 'Y', 'S' };
		Double[] arrDouble = { 100.1, 200.1, 300.1, 400.1, 500.1, 600.1 };
		TestGeneric tg = new TestGeneric();
		tg.printArray(arrInteger);
		//tg.printArray(arrChar);
		tg.printArray(arrDouble);

	}

	public < T  extends Number> void  printArray(T[] arrInteger) {
		for(T i :arrInteger)
		{
			System.out.print(i+" ");
		}
		System.out.println();	
		
	}

}

