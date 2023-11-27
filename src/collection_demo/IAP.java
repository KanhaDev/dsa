package collection_demo;

public class IAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {87,101,108,99,111,109,101};
		String str = "";
		for(int i=0;i<arr.length;i++) {
			str+=(char)arr[i];
		}
		System.out.println(str);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
