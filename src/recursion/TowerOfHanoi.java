package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		towerOfHanoi(n,'A','B','C');

	}
	
	public static void towerOfHanoi(int n ,char A , char B , char C) {
		if(n==1) {
			System.out.println("move disc 1 from "+ A +" to "+C);
			return;
		}
		
		towerOfHanoi(n-1,A,C,B);
		System.out.println("move disc "+n+" from "+A+" to "+C);
		towerOfHanoi(n-1,B,A,C);
	}

}
